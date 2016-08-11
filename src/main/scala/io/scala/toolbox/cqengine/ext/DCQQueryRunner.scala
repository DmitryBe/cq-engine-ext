package io.scala.toolbox.cqengine.ext

import java.util
import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.googlecode.cqengine.resultset.ResultSet
import io.scala.toolbox.cqengine.ConcurrentIndexedCollectionEx
import io.scala.toolbox.cqengine.parser.ExtSqlParser
import scala.collection.JavaConversions._
import scala.collection.mutable
import scala.concurrent.{ExecutionContext, Future, Promise}
import scala.util.{Failure, Success}

trait TDCQQueryResultBase
case class TDCQQueryResult(result: Seq[util.Map[_, _]]) extends TDCQQueryResultBase
case class DCQAggregatedResult(result: Map[_, Int], limit: Int, sortByDirection: Option[String]) extends TDCQQueryResultBase
case class DCQCountResult(count: Int) extends TDCQQueryResultBase

object DCQQueryRunner {
  def create(schema: Map[String, String])(implicit ec: ExecutionContext) = new DCQQueryRunner(schema)
}

class DCQQueryRunner(schema: Map[String, String])
                    (implicit ec: ExecutionContext) {

  val parser = ExtSqlParser.create(schema)

  def query(query: String)
           (implicit indexedCollection: ConcurrentIndexedCollectionEx): TDCQQueryResultBase ={

    parser.parseQuery(query) match {

      case q: DCQSQLQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)
          TDCQQueryResult(iter.take(q.limit).toSeq)
        } finally { iter.close()}

      case q: DCQFoldByKeyQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)
          val d = ConcurrentIndexedCollectionEx.foldBy(q.foldByKey, iter, null)
          DCQAggregatedResult(d.toMap, q.limit, sortByDirection=q.sortByDirection)
        } finally {iter.close()}

      case q: DCQSQLCountQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)
          DCQCountResult(iter.size())
        } finally { iter.close() }

      case q: DCQHistogramQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)

          val key = "getHli_allele_frequency"
          DCQAggregatedResult(ConcurrentIndexedCollectionEx.histogram(key, iter, 0).toMap, Int.MaxValue, sortByDirection=None)
        } finally {iter.close()}

      case _ => throw new Exception("cannot recognize query type")
    }
  }

  def queryMultiple(sql: String)
                   (partitions: Seq[ConcurrentIndexedCollectionEx]): Future[TDCQQueryResultBase] ={

    val resultPromise = Promise[TDCQQueryResultBase]

    val partitionQueries = for {
      p <- partitions
      f = Future {
        query(sql)(p)
      }
    } yield f

    Future.sequence(partitionQueries) onComplete {

      case Success(partitionsResult) =>
        reduce(sql)(partitionsResult) onComplete {
          case Success(r) =>
            resultPromise.success(r)
          case Failure(e) =>
            resultPromise.failure(e)
        }
      case Failure(e) =>
        resultPromise.failure(e)
    }

    resultPromise.future
  }

  def reduce(sql: String)
            (partitionsResult: Seq[TDCQQueryResultBase]): Future[TDCQQueryResultBase] ={

    val resultPromise = Promise[TDCQQueryResultBase]

    partitionsResult.head  match {

      case t : TDCQQueryResult =>

        val results = partitionsResult.asInstanceOf[Seq[TDCQQueryResult]]
        val aggregatedIndexedCollection = new ConcurrentIndexedCollectionEx(Map.empty[String, String])
        results foreach { ri =>
          aggregatedIndexedCollection.addAll(ri.result)
        }
        val aggregatedResult = query(sql)(aggregatedIndexedCollection)
        resultPromise.success(aggregatedResult)

      case t : DCQCountResult =>

        val results = partitionsResult.asInstanceOf[Seq[DCQCountResult]]
        val aggregatedResult = DCQCountResult(results.map(x => x.count).sum)
        resultPromise.success(aggregatedResult)

      case t : DCQAggregatedResult =>

        val results = partitionsResult.asInstanceOf[Seq[DCQAggregatedResult]]
        val aggregatedResult = results.foldLeft(mutable.Map.empty[Any, Int])((res, row) => {
          row.result.foldLeft(res)((resTmp, pair) => {
            resTmp(pair._1) = resTmp.getOrElse(pair._1, 0) + pair._2
            resTmp
          })
        })

        val sortedAggregatedResult = t.sortByDirection match {

          case Some("asc") =>
            aggregatedResult.toSeq
              .sortBy(_._2)
              .take(t.limit)

          case _ =>
            /* default sort is desc*/
            aggregatedResult.toSeq
              .sortBy(_._2)
              .reverse
              .take(t.limit)
        }
        val sortedAggregatedResultMap = Map(sortedAggregatedResult : _*)
        resultPromise.success(DCQAggregatedResult(sortedAggregatedResultMap, t.limit, t.sortByDirection))

      case _ =>
        resultPromise.failure(new Exception("not supported query"))
    }

    resultPromise.future
  }

}
