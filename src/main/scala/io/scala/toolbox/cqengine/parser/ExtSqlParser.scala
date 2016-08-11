package io.scala.toolbox.cqengine.parser

import java.util
import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.googlecode.cqengine.attribute.Attribute
import com.googlecode.cqengine.entity.MapEntity
import com.googlecode.cqengine.index.navigable.NavigableIndex
import com.googlecode.cqengine.query.Query
import com.googlecode.cqengine.query.QueryFactory._
import com.googlecode.cqengine.query.option.EngineThresholds._
import com.googlecode.cqengine.query.option.{AttributeOrder, OrderByOption, QueryOptions}
import com.googlecode.cqengine.query.parser.common.{ParseResult, QueryParser}
import com.googlecode.cqengine.query.parser.sql.SQLParser
import com.googlecode.cqengine.query.parser.sql.support.{FallbackValueParser, StringParser}
import com.googlecode.cqengine.resultset.ResultSet
import io.scala.toolbox.cqengine.ext._
import io.scala.toolbox.cqengineex.{DCQGrammarLexer, DCQGrammarParser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import org.antlr.v4.runtime.tree.ParseTreeWalker
import scala.collection.JavaConversions._
import scala.collection.mutable
import scala.util.{Failure, Success, Try}

class ExtSqlParser(schemaDescription: Map[String, String]) extends QueryParser(classOf[java.util.Map[_, _]]){

  val stringParser: StringParser = new StringParser
  super.registerValueParser(classOf[String], stringParser)
  super.registerFallbackValueParser(new FallbackValueParser(stringParser))

  val collectionAttrs = CqEngineAttributesGenerator.createAttrs(schemaDescription)
  this.registerAttributes(collectionAttrs)

  /*
      use to create DCQ query (can be run by DCQQueryRunner)
    */
  def parseQuery(query: String): DCQQueryBase ={

    ExtSqlParser.parseDCQSQLExpression(query) map { queryParsedCtx =>

      val queryMd5Hash = DCQQueryHashGenerator.generate(queryParsedCtx) match {
        case Success(hash) => hash.hashMD5
        case Failure(e) => throw e
      }

      val listener = traverseAST(queryParsedCtx)

      val (h, g) = (listener.getHistogram, listener.getGroupBy)
      val r = (h, g) match {

        case (Some(histogram), None) =>
          DCQHistogramQuery(
            queryMd5Hash,
            listener.getParsedQuery,
            rebuildQueryOptions(listener.getQueryOptions)
          )

        case (None, Some(groupByAttr)) =>
          DCQFoldByKeyQuery(
            queryMd5Hash,
            listener.getParsedQuery,
            rebuildQueryOptions(listener.getQueryOptions),
            groupByAttr,
            listener.getLimit,
            listener.getSortByDirection
          )

        case (None, None) =>

          listener.getHasCountClause match {

            case false =>
              DCQSQLQuery(
                queryMd5Hash,
                listener.getParsedQuery,
                rebuildQueryOptions(listener.getQueryOptions),
                listener.getLimit
              )

            case true =>
              DCQSQLCountQuery(
                queryMd5Hash,
                listener.getParsedQuery,
                rebuildQueryOptions(listener.getQueryOptions)
              )
          }

        case _ => throw new Exception("unknown query type")
      }

      r.asInstanceOf[DCQQueryBase]

    } match {
      case Success(r) => r
      case Failure(e) => throw e
    }
  }

  /*
    default parser; doesn't support enhanced operations
  */
  override def parse(query: String): ParseResult[java.util.Map[_, _]] = {

    ExtSqlParser.parseDCQSQLExpression(query) map { queryParsedCtx =>

      val listener = traverseAST(queryParsedCtx)
      new ParseResult[java.util.Map[_, _]](
        listener.getParsedQuery,
        rebuildQueryOptions(listener.getQueryOptions)
      )
    } match {
      case Success(r) => r
      case Failure(e) => throw e
    }
  }

  /*
      traverse AST using CQEngineBaseListener
    */
  private def traverseAST(queryContext: DCQGrammarParser.StartContext): CQEngineBaseListener[java.util.Map[_, _]] ={

    val walker = new ParseTreeWalker()
    val listener = new CQEngineBaseListener[java.util.Map[_, _]](this)
    walker.walk(listener, queryContext)
    listener
  }

  /*
   rebuild query options to apply missing last strategy (required!)
 */
  private def rebuildQueryOptions(qo: QueryOptions): QueryOptions ={

    val resultOptions = new QueryOptions()

    val orderByOptions = qo.getOptions
      .filter(_._2.isInstanceOf[com.googlecode.cqengine.query.option.OrderByOption[_]])
      .values

    orderByOptions.size match {
      case x if x equals 0 => // default sort by if not specified

      case _ =>
        orderByOptions.asInstanceOf[Iterable[OrderByOption[util.Map[_, _]]]] foreach  { x =>
          x.getAttributeOrders foreach  { atrOrder =>

            val attrName = atrOrder.getAttribute.getAttributeName
            val attrIndex = getIdx(attrName)

            val missingLastAttr = missingLast(attrIndex)
            val orderAttr = new AttributeOrder[util.Map[_, _]](missingLastAttr, atrOrder.isDescending)
            val orderByO = orderBy(orderAttr)

            resultOptions.put(orderByO.getClass, orderByO)
          }
        }
    }

    // required: https://github.com/npgall/cqengine/blob/master/documentation/OrderingStrategies.md
    if (resultOptions.getOptions.size() > 0) {
      val t = applyThresholds(threshold(INDEX_ORDERING_SELECTIVITY, 1.0))
      resultOptions.put(t.getClass, t)
    }

    resultOptions
  }

  private def getIdx(attrName: String): Attribute[util.Map[_, _], _ <: Comparable[_]] = {

    collectionAttrs.get(attrName) match {
      case Some(idx) => idx
      case None => throw new Exception(s"attribute with name $attrName not found")
    }
  }
}

object ExtSqlParser{

  /*
    create and initialize instance of DCQSqlParser
  */
  def create[O](schemaDescription: Map[String, String]): ExtSqlParser ={
    new ExtSqlParser(schemaDescription)
  }

  /*
    parse sql and create dcq grammar context (for traversing)
  */
  def parseDCQSQLExpression(query: String): Try[DCQGrammarParser.StartContext] ={

    val lexer = new DCQGrammarLexer(new ANTLRInputStream(query))
    lexer.removeErrorListeners()
    val tokens = new CommonTokenStream(lexer)

    val parser = new DCQGrammarParser(tokens)
    parser.removeErrorListeners()

    val errorListener = new ExtCqlParserErrorListener()
    parser.addErrorListener(errorListener)

    Try{
      val ctx = parser.start()
      if (errorListener.getErrors.isEmpty equals false)
        throw DCQQuerySyntaxError(errorListener.getErrors.toList)
      ctx
    }
  }

}
