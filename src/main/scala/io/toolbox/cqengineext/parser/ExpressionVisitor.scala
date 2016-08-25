package io.toolbox.cqengineext.parser

import io.toolbox.cqengineex.CQSqlGrammarExtBaseVisitor
import io.toolbox.cqengineex.CQSqlGrammarExtParser.ExprContext
import io.toolbox.cqengineext.projection.{CaseColumn, WhenExpr}
import org.antlr.v4.runtime.tree.TerminalNode
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

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
