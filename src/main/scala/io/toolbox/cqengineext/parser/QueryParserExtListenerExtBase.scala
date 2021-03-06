package io.toolbox.cqengineext.parser

import java.util.concurrent.atomic.AtomicInteger

import com.googlecode.cqengine.query.parser.common.QueryParser
import io.toolbox.cqengineex.CQSqlGrammarExtBaseVisitor
import io.toolbox.cqengineex.CQSqlGrammarExtParser._
import io.toolbox.cqengineex.parser.CQEngineAntlrExtBaseListener
import io.toolbox.cqengineext.projection._
import org.antlr.v4.runtime.tree.TerminalNode

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer
import scala.util.Try

class QueryParserExtListenerExtBase[O](parser: QueryParser[O]) extends CQEngineAntlrExtBaseListener[O](parser){

  private val uniqCounter = new AtomicInteger(0)
  private var limit = None : Option[Int]
  private var groupBy = None : Option[String]
  private var histogram = None: Option[Int]
  private var hasCountClause = false
  private var isDistinctCount = false
  private var isDistinctCountApprox = false
  private var sortByDirection = None: Option[String]
  private var resultColumns = ListBuffer.empty[TResultColumn]

  def getLimit = limit.getOrElse(10)
  def getGroupBy = groupBy
  def getHistogram = histogram
  def getHasCountClause = hasCountClause
  def getIsDistinctCount = isDistinctCount
  def getIsDistinctCountApprox = isDistinctCountApprox
  def getCountDistinctColumns = resultColumns.map{ case x: SimpleColumn => x.columnName }
  def getSortByDirection = sortByDirection
  def getQueryProjection = QueryProjection(resultColumns)

  override def exitLimitClause(ctx: LimitClauseContext): Unit = {

    limit = Try{
      val literal = ctx.NUMERIC_LITERAL()
      Some(literal.getText.toInt)
    }.getOrElse(None)
  }

  override def exitGroupByClause(ctx: GroupByClauseContext): Unit = {

    groupBy = Try{
      val literal = ctx.IDENTIFIER()
      Some(literal.getText)
    }.getOrElse(None)
  }

  override def exitHistogramClause(ctx: HistogramClauseContext): Unit = {

    histogram = Try{
      val literal = ctx.NUMERIC_LITERAL()
      Some(literal.getText.toInt)
    }.getOrElse(None)
  }

  override def exitCountClause(ctx: CountClauseContext): Unit = {

    hasCountClause = true
    if(ctx.K_DISTINCT() != null){
      isDistinctCount = true
      if(ctx.F_HLL() != null){
        isDistinctCountApprox = true
      }
      val distinctColumnsCount = ctx.column_name().length
      assert(distinctColumnsCount > 0, "count distinct require column names (one or many)")
      resultColumns ++= ctx.column_name().map{ x => SimpleColumn(x.getText)}
    }
  }

  override def exitOrderByClause(ctx: OrderByClauseContext): Unit = {
    super.exitOrderByClause(ctx)

    sortByDirection = Try{
      val firstSortByDirection = ctx.attributeOrder(0).direction()
      firstSortByDirection.K_ASC() != null match {
        case true => Some("asc")
        case false => Some("desc")
      }
    }.getOrElse(None)
  }

  override def enterResult_column_simple(ctx: Result_column_simpleContext): Unit = {

    (ctx.histogramClause() != null, ctx.countClause() != null, ctx.expr() != null) match {
      case (true, false, false) =>
        /*
          histogram function
         */

      case (false, true, false) =>
        /*
          count function
         */

      case (false, false, true) =>
        /*
          expression column
         */

        val expr = ctx.expr()
        val colAlias = Option(ctx.column_alias()).map(x => x.getText)

        (expr.column_name() != null, !expr.expr().isEmpty, expr.K_CASE() != null) match {
          case (false, false, false) =>
            resultColumns += StartColumn()
          case (true, false, false) =>
            val exprVisitor = new ExpressionVisitor()
            val colName = ctx.expr().accept(exprVisitor)
            resultColumns += SimpleColumn(colName.expr, colAlias)
          case (false, true, false) =>
            val exprVisitor = new ExpressionVisitor()
            val exprInfo = ctx.expr().accept(exprVisitor)
            resultColumns += ExprColumn(exprInfo, colAlias.getOrElse(createTmpColumnName))
          case (false, true, true) =>
            val caseExprVisitor = new CaseExpressionVisitor()
            val caseExp = ctx.expr().accept(caseExprVisitor)
            resultColumns += CaseColumn(caseExp.whenExprs, caseExp.elseExprInfo, colAlias.getOrElse(createTmpColumnName))
          case _ =>
        }

        assert(true)

      case _ =>
        /*
          unknown
        */
    }
  }

  private def createTmpColumnName = s"_col_${uniqCounter.incrementAndGet()}"

}
