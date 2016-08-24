package io.toolbox.cqengineext.parser

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

  private var limit = None : Option[Int]
  private var groupBy = None : Option[String]
  private var histogram = None: Option[Int]
  private var hasCountClause = false
  private var sortByDirection = None: Option[String]
  private var resultColumns = ListBuffer.empty[TResultColumn]

  def getLimit = limit.getOrElse(10)
  def getGroupBy = groupBy
  def getHistogram = histogram
  def getHasCountClause = hasCountClause
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
            resultColumns += ExprColumn(exprInfo, colAlias.getOrElse("_tmp1"))
          case (false, true, true) =>
            val caseExprVisitor = new CaseExpressionVisitor()
            val caseExp = ctx.expr().accept(caseExprVisitor)
            resultColumns += CaseColumn(caseExp.whenExprs, caseExp.elseExprInfo, colAlias.getOrElse("_tmp2"))
          case _ =>
        }

        assert(true)

      case _ =>
        /*
          unknown
        */
    }
  }

}

class CaseExpressionVisitor extends CQSqlGrammarExtBaseVisitor[CaseColumn]{
  override def visitExpr(ctx: ExprContext): CaseColumn = {

    if(ctx.K_CASE() != null){
      val exprVisitor = new ExpressionVisitor()

      /*
        when branches
       */
      val whenExprList = ListBuffer.empty[WhenExpr]
      val whenBranchesCount = ctx.K_WHEN().length
      for (i <- 0 until (whenBranchesCount*2) by 2){
        val whenExprInfo = ctx.expr(i).accept(exprVisitor)
        val thenExprInfo = ctx.expr(i + 1).accept(exprVisitor)
        whenExprList += WhenExpr(whenExprInfo, thenExprInfo)
      }

      val elseExprInfo = Option(ctx.K_ELSE()) map {x => ctx.expr(whenBranchesCount * 2).accept(exprVisitor)}
      CaseColumn(whenExprList, elseExprInfo, "")
    }
    else
      throw new Exception(s"unsupported case expression '${ctx.getText}'")
  }
}

case class ExpressionInfo(expr: String, columns: List[String], literals: List[String])

class ExpressionVisitor extends CQSqlGrammarExtBaseVisitor[ExpressionInfo]{
  override def visitExpr(ctx: ExprContext): ExpressionInfo = {

    if(ctx.literal_value() != null){
      /*
        literal expr
       */
      val v = ctx.literal_value().getText
      ExpressionInfo(
        expr = v,
        columns = List.empty[String],
        literals = List(v)
      )
    } else if(ctx.column_name() != null) {
      /*
        column expr
       */
      val v = ctx.column_name().getText
      ExpressionInfo(
        expr = v,
        columns = List(v),
        literals = List.empty[String]
      )
    } else if(!ctx.expr().isEmpty) {
      /*
        nested expr
       */
      val childExprs = ctx.children.map {
        case x: ExprContext =>
          visitExpr(x)
        case x: TerminalNode =>
          ExpressionInfo(
            expr = x.getText,
            columns = List.empty[String],
            literals = List.empty[String]
          )
      }
      val r = childExprs.foldLeft(ExpressionInfo("", List.empty[String], List.empty[String]))((res, i) => {
        ExpressionInfo(
          expr = s"${res.expr} ${i.expr}",
          columns = res.columns ++ i.columns,
          literals = res.literals ++ i.literals
        )
      })
      r
    }
    else
      throw new Exception(s"unsupported expression type '${ctx.getText}'")
  }
}