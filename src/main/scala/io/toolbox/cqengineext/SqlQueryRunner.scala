package io.toolbox.cqengineext

import java.util
import com.googlecode.cqengine.resultset.ResultSet
import io.toolbox.cqengineext.parser.{SqlParserExt}
import scala.collection.mutable
import scala.concurrent.{ExecutionContext, Future, Promise}
import scala.util.{Failure, Success}
import scala.collection.JavaConversions._
import scala.collection.JavaConversions.{mapAsScalaMap, mapAsJavaMap}

object SqlQueryRunner {
  def create(schema: Map[String, String])(implicit ec: ExecutionContext) = new SqlQueryRunner(schema)
}

class SqlQueryRunner(schema: Map[String, String])
                    (implicit ec: ExecutionContext) {

  val parser = SqlParserExt.create(schema)

  def query(query: String)
           (implicit indexedCollection: ConcurrentIndexedCollectionExt): TQueryResultBase ={

    parser.parseQuery(query) match {

      case q: SQLQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)
          QueryDataSetResult(iter.take(q.limit).toSeq)
        } finally { iter.close()}

      case q: FoldByKeyQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)
          val d = ConcurrentIndexedCollectionExt.foldBy(q.foldByKey, iter, null)
          QueryAggregatedResult(d.toMap, q.limit, sortByDirection=q.sortByDirection)
        } finally {iter.close()}

      case q: SQLCountQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)
          QueryCountResult(iter.size())
        } finally { iter.close() }

      case q: HistogramQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)

          //! need to retrieve from query
          val key = "hli_allele_frequency"
          QueryAggregatedResult(ConcurrentIndexedCollectionExt.histogram(key, iter, 0).toMap, Int.MaxValue, sortByDirection=None)
        } finally {iter.close()}

      case _ => throw new Exception("cannot recognize query type")
    }
  }

  def queryMultiple(sql: String)
                   (partitions: Seq[ConcurrentIndexedCollectionExt]): Future[TQueryResultBase] ={

    val resultPromise = Promise[TQueryResultBase]

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

  def queryMultipleT[TResult <: TQueryResultBase](sql: String)
                   (partitions: Seq[ConcurrentIndexedCollectionExt]): Future[TResult] ={
    queryMultiple(sql)(partitions) map {x => x.asInstanceOf[TResult]}
  }

  def reduce(sql: String)
            (partitionsResult: Seq[TQueryResultBase]): Future[TQueryResultBase] ={

    val resultPromise = Promise[TQueryResultBase]

    partitionsResult.head  match {

      case t : QueryDataSetResult =>

        val results = partitionsResult.asInstanceOf[Seq[QueryDataSetResult]]
        val aggregatedIndexedCollection = new ConcurrentIndexedCollectionExt(Map.empty[String, String])
        results foreach { ri =>
          aggregatedIndexedCollection.addAllT(ri.result)
        }
        val aggregatedResult = query(sql)(aggregatedIndexedCollection)
        resultPromise.success(aggregatedResult)

      case t : QueryCountResult =>

        val results = partitionsResult.asInstanceOf[Seq[QueryCountResult]]
        val aggregatedResult = QueryCountResult(results.map(x => x.count).sum)
        resultPromise.success(aggregatedResult)

      case t : QueryAggregatedResult =>

        val results = partitionsResult.asInstanceOf[Seq[QueryAggregatedResult]]
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
        resultPromise.success(QueryAggregatedResult(sortedAggregatedResultMap, t.limit, t.sortByDirection))

      case _ =>
        resultPromise.failure(new Exception("not supported query"))
    }

    resultPromise.future
  }

}
