package io.toolbox.cqengineext

import java.util

trait TQueryResultBase
case class QueryDataSetResult(result: Seq[util.Map[_, _]]) extends TQueryResultBase
case class QueryAggregatedResult(result: Map[_, Int], limit: Int, sortByDirection: Option[String]) extends TQueryResultBase
case class QueryCountResult(count: Int) extends TQueryResultBase
case class QueryCountDistinctResult(set: scala.collection.mutable.Set[String]) extends TQueryResultBase {
  def count = set.size
}
case class QueryCountDistinctHllResult(hll: com.twitter.algebird.HLL) extends TQueryResultBase {
  def count = hll.approximateSize.estimate
}

