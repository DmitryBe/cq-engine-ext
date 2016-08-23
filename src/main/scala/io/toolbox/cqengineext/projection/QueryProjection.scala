package io.toolbox.cqengineext.projection

import com.twitter.util.Eval
import io.toolbox.utils.MD5Helper
import scala.collection.mutable

case class QueryProjection(resultColumns: Seq[TResultColumn])

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
case class ExprColumn(expr: String, alias: String)(implicit expCompiler: ExpCompiler) extends TResultColumn {
  override def project(row: mutable.Map[String, Any]): mutable.Map[String, Any] = {

    val func = expCompiler.compileExpr(expr)
    mutable.Map(alias -> func(row))
  }
}

/*
  case
    when expr -> Boolean then expr -> TResult
    ...
  end as c1
 */
case class CaseColumn(whenExpr: WhenExpr, elseExpr: Option[String], alias: String)(implicit expCompiler: ExpCompiler) extends TResultColumn {
  override def project(row: mutable.Map[String, Any]): mutable.Map[String, Any] = {
    whenExpr.evaluate(row) match {
      case Some(v) =>
        mutable.Map(alias -> v)
      case None =>
        elseExpr match {
          case Some(_elseExp) =>
            val func = expCompiler.compileExpr(_elseExp)
            mutable.Map(alias -> func(row))
          case None =>
            throw new Exception("else expression is None")
        }
    }
  }
}

case class WhenExpr(boolExpr: String, valExpr: String)(implicit expCompiler: ExpCompiler) {
  def evaluate(row: mutable.Map[String, Any]): Option[Any] = {
    val func = expCompiler.compile[Boolean](boolExpr)
    func(row) match {
      case true =>
        val funcExp = expCompiler.compileExpr(valExpr)
        Some(funcExp(row))
      case false =>
        None
    }
  }
}



