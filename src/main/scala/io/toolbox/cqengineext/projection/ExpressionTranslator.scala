package io.toolbox.cqengineext.projection

import io.toolbox.cqengineext.parser.ExpressionInfo

object ExpressionTranslator {

  private val EXPR_SCALA_HEADER =
    """
      |(row: scala.collection.mutable.Map[String, Any]) => {
      |   import io.toolbox.cqengineext.projection.AnyValExt._
      |
    """.stripMargin

  private val EXPR_SCALA_FOOTER =
    """
      |
      |}
    """.stripMargin

  def translateArithmeticExpr2ScalaMethod(exprInfo: ExpressionInfo): String = {

    val exprBuilder = StringBuilder.newBuilder
    exprBuilder.append(EXPR_SCALA_HEADER)

    exprInfo.columns.distinct
      .map {c => s"""val $c = row.getOrElse(\"$c\", null).asInstanceOf[AnyVal] \n"""}
      .foreach{r => exprBuilder.append(r)}

    exprBuilder.append(exprInfo.expr)

    exprBuilder.append(EXPR_SCALA_FOOTER)

    exprBuilder.toString
  }
}