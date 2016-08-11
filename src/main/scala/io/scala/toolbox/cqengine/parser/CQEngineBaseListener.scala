package io.scala.toolbox.cqengine.parser

import com.googlecode.cqengine.query.parser.common.QueryParser
import io.scala.toolbox.cqengineex.DCQGrammarParser._
import io.scala.toolbox.cqengineex.parser.CQEngineAntlrBaseListener
import scala.util.Try

class CQEngineBaseListener[O](parser: QueryParser[O]) extends CQEngineAntlrBaseListener[O](parser){

  private var limit = None : Option[Int]
  private var groupBy = None : Option[String]
  private var histogram = None: Option[Int]
  private var hasCountClause = false
  private var sortByDirection = None: Option[String]

  def getLimit = limit.getOrElse(10)
  def getGroupBy = groupBy
  def getHistogram = histogram
  def getHasCountClause = hasCountClause
  def getSortByDirection = sortByDirection

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
}
