package io.toolbox.cqengineext.projection

import com.twitter.util.Eval
import io.toolbox.cqengineext.parser.ExpressionInfo
import io.toolbox.utils.MD5Helper
import scala.collection.mutable
import scala.util.control.Breaks._

case class QueryProjection(resultColumns: Seq[TResultColumn]) {
  def length = resultColumns.length
}



trait TResultColumn{
  def project(row: mutable.Map[String, Any]): mutable.Map[String, Any]

  def createColumnName(columnName: String, alias: Option[String]) = alias match {
    case Some(a) => a
    case None => columnName
  }
}

/*
  equivalent of *
 */
case class StartColumn() extends TResultColumn{
  override def project(row: mutable.Map[String, Any]): mutable.Map[String, Any] = row
}

/*
  equivalent of col1 as c1
 */
case class SimpleColumn(columnName: String, alias: Option[String] = None) extends TResultColumn {
  override def project(row: mutable.Map[String, Any]): mutable.Map[String, Any] = {
    row.get(columnName) match {
      case Some(x) => mutable.Map(createColumnName(columnName, alias) -> x)
      case None => throw new Exception(s"column name '$columnName' not found in result data set")
    }
  }
}

/*
  equivalent of col1 - col2 as c1
 */
case class ExprColumn(exprInfo: ExpressionInfo, alias: String)(implicit expCompiler: ExpCompiler) extends TResultColumn {
  override def project(row: mutable.Map[String, Any]): mutable.Map[String, Any] = {

    val scalaExpr = ExpressionTranslator.translateArithmeticExpr2ScalaMethod(exprInfo)
    val func = expCompiler.compileExpr(scalaExpr)
    mutable.Map(alias -> func(row))
  }
}

/*
  case
    when expr -> Boolean then expr -> TResult
    ...
  end as c1
 */
case class CaseColumn(whenExprs: Seq[WhenExpr], elseExprInfo: Option[ExpressionInfo], alias: String)(implicit expCompiler: ExpCompiler) extends TResultColumn {
  override def project(row: mutable.Map[String, Any]): mutable.Map[String, Any] = {

    var result = None: Option[mutable.Map[String, Any]]
    breakable{
      for(whenExpr <- whenExprs){
        whenExpr.evaluate(row) match {
          case Some(v) =>
            result = Some(mutable.Map(alias -> v))
            break()
          case None =>
        }
      }
    }

    (result, elseExprInfo) match {
      case (None, Some(_elseExprInfo)) =>
        val scalaElseExpr = ExpressionTranslator.translateArithmeticExpr2ScalaMethod(_elseExprInfo)
        val func = expCompiler.compileExpr(scalaElseExpr)
        result = Some(mutable.Map(alias -> func(row)))
      case _ => /* to do ? */
    }

    // not safe
    result.get
  }
}

case class WhenExpr(boolExprInfo: ExpressionInfo, valExprInfo: ExpressionInfo)(implicit expCompiler: ExpCompiler) {
  def evaluate(row: mutable.Map[String, Any]): Option[Any] = {
    val scalaBoolExpr = ExpressionTranslator.translateArithmeticExpr2ScalaMethod(boolExprInfo)
    val func = expCompiler.compile[Boolean](scalaBoolExpr)
    func(row) match {
      case true =>
        val scalaValExp = ExpressionTranslator.translateArithmeticExpr2ScalaMethod(valExprInfo)
        val funcExp = expCompiler.compileExpr(scalaValExp)
        Some(funcExp(row))
      case false =>
        None
    }
  }
}
