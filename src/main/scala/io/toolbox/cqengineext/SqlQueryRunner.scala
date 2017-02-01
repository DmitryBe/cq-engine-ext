package io.toolbox.cqengineext

import java.util

import com.googlecode.cqengine.resultset.ResultSet
import com.twitter.algebird.HyperLogLogMonoid
import io.toolbox.cqengineext.parser.SqlParserExt
import io.toolbox.cqengineext.projection.{ExpCompiler, QueryProjector}

import scala.collection.mutable
import scala.concurrent.{ExecutionContext, Future, Promise}
import scala.util.{Failure, Success}
import scala.collection.JavaConversions._
import scala.collection.JavaConversions.{mapAsJavaMap, mapAsScalaMap}

/*
  required for query projection (runtime expression compilation)
*/
import ExpCompiler.defaultCompiler

object SqlQueryRunner {
  def create(schema: Map[String, String])(implicit ec: ExecutionContext) = new SqlQueryRunner(schema)
}

class SqlQueryRunner(schema: Map[String, String])
                    (implicit ec: ExecutionContext) {

  val parser = SqlParserExt.create(schema)

  def query(query: String, project: Boolean = false)
           (implicit indexedCollection: ConcurrentIndexedCollectionExt): Future[TQueryResultBase] = Future {

    parser.parseQuery(query) match {

      case q: SQLQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)

          project match {
            case true =>

              // note
              // not elegant: extra conversion is required: java.Map -> scala.Map -> java.Map
              val ds = iter.take(q.limit) map {x => mapAsScalaMap(x).asInstanceOf[mutable.Map[String, Any]]}
              val projectedRes = QueryProjector.project(ds.toSeq, q.columnsProjection)

              QueryDataSetResult(projectedRes map {x => mapAsJavaMap(x)})

            case false =>
              QueryDataSetResult(iter.take(q.limit).toSeq)
          }

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

      case q: SQLCountDistinctQuery =>

        var iter: ResultSet[util.Map[_, _]] = null
        try {
          iter = indexedCollection.retrieve(q.query, q.queryOptions)

          val createUniqKeyFunc = q.distinctColumns match {
            case Seq(col1) => createUniqKey(col1)(_)
            case Seq(col1, col2) => createUniqKey(col1,col2)(_)
            case Seq(col1, col2, col3) => createUniqKey(col1,col2,col3)(_)
            case Seq(col1, col2, col3, col4) => createUniqKey(col1,col2,col3,col4)(_)
            case Seq(col1, col2, col3, col4, col5) => createUniqKey(col1,col2,col3,col4,col5)(_)
            case Seq(col1, col2, col3, col4, col5, col6) => createUniqKey(col1,col2,col3,col4,col5,col6)(_)
            case Seq(col1, col2, col3, col4, col5, col6, col7) => createUniqKey(col1,col2,col3,col4,col5,col6,col7)(_)
            case _ => throw new Exception("not supported")
          }

          q.isApprox match {

            case true =>

              // count distinct approx using hll
              val hllMonoid = new HyperLogLogMonoid(bits = 10)

              val emptyHll = hllMonoid.create("".getBytes)
              val hllSum = iter.foldLeft(emptyHll)((accumulatedHll, row) => {
                val uniqValHll = hllMonoid.create(createUniqKeyFunc(row).getBytes)
                hllMonoid.plus(accumulatedHll, uniqValHll)
              })

              QueryCountDistinctHllResult(hllSum)

            case false =>
              // count distinct precise
              val distinctValuesMap = iter.foldLeft(mutable.Set.empty[String])((set, row) => {
                set += createUniqKeyFunc(row)
                set
              })
              QueryCountDistinctResult(distinctValuesMap)
          }

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

  def queryMultiple(sql: String, project: Boolean = true)
                   (partitions: Seq[ConcurrentIndexedCollectionExt]): Future[TQueryResultBase] ={

    val resultPromise = Promise[TQueryResultBase]

    val partitionQueries = for {
      p <- partitions
    } yield query(sql, project = false)(p)

    Future.sequence(partitionQueries) onComplete {

      case Success(partitionsResult) =>
        reduce(sql, project)(partitionsResult) onComplete {
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

  def queryMultipleT[TResult <: TQueryResultBase](sql: String, project: Boolean = true)
                    (partitions: Seq[ConcurrentIndexedCollectionExt]): Future[TResult] ={
    queryMultiple(sql, project)(partitions) map {x => x.asInstanceOf[TResult]}
  }

  def reduce(sql: String, project: Boolean)
             (partitionsResult: Seq[TQueryResultBase]): Future[TQueryResultBase] ={

    partitionsResult.head  match {

      case t : QueryDataSetResult =>

        val results = partitionsResult.asInstanceOf[Seq[QueryDataSetResult]]
        val aggregatedIndexedCollection = new ConcurrentIndexedCollectionExt(Map.empty[String, String])
        results foreach { ri =>
          aggregatedIndexedCollection.addAllT(ri.result)
        }
        val queryFuture = query(sql, project = project)(aggregatedIndexedCollection)
        queryFuture

      case t : QueryCountResult =>

        Future {
          val results = partitionsResult.asInstanceOf[Seq[QueryCountResult]]
          QueryCountResult(results.map(x => x.count).sum)
        }

      case t: QueryCountDistinctResult =>

        Future{

          val results = partitionsResult.asInstanceOf[Seq[QueryCountDistinctResult]]
          val unionDistincts = results.map(x => x.set).reduceLeft((a,b) => {
            a.union(b)
          })
          QueryCountDistinctResult(unionDistincts)
        }

      case t: QueryCountDistinctHllResult =>

        Future{
          val results = partitionsResult.asInstanceOf[Seq[QueryCountDistinctHllResult]]
          val hll = new HyperLogLogMonoid(bits = 10)
          val reducedHll = hll.sum(results.map(_.hll))
          QueryCountDistinctHllResult(reducedHll)
        }

      case t : QueryAggregatedResult =>

        Future {
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
          val sortedAggregatedResultMap = Map(sortedAggregatedResult: _*)
          QueryAggregatedResult(sortedAggregatedResultMap, t.limit, t.sortByDirection)
        }

      case _ =>
        Future.failed(new Exception("not supported query"))
    }

  }

  private def createUniqKey(col1: String)(row: util.Map[_,_]) = {
    row.get(col1).toString
  }

  private def createUniqKey(col1: String, col2: String)(row: util.Map[_,_]) = {
    s"${row.get(col1).toString}_${row.get(col2).toString}"
  }

  private def createUniqKey(col1: String, col2: String, col3: String)(row: util.Map[_,_]) = {
    s"${row.get(col1).toString}_${row.get(col2).toString}_${row.get(col3).toString}"
  }

  private def createUniqKey(col1: String, col2: String, col3: String, col4: String)(row: util.Map[_,_]) = {
    s"${row.get(col1).toString}_${row.get(col2).toString}_${row.get(col3).toString}_${row.get(col4).toString}"
  }

  private def createUniqKey(col1: String, col2: String, col3: String, col4: String, col5: String)(row: util.Map[_,_]) = {
    s"${row.get(col1).toString}_${row.get(col2).toString}_${row.get(col3).toString}_${row.get(col4).toString}_${row.get(col5).toString}"
  }

  private def createUniqKey(col1: String, col2: String, col3: String, col4: String, col5: String, col6: String)(row: util.Map[_,_]) = {
    s"${row.get(col1).toString}_${row.get(col2).toString}_${row.get(col3).toString}_${row.get(col4).toString}_${row.get(col5).toString}_${row.get(col6).toString}"
  }

  private def createUniqKey(col1: String, col2: String, col3: String, col4: String, col5: String, col6: String, col7: String)(row: util.Map[_,_]) = {
    s"${row.get(col1).toString}_${row.get(col2).toString}_${row.get(col3).toString}_${row.get(col4).toString}_${row.get(col5).toString}_${row.get(col6).toString}_${row.get(col7).toString}"
  }
}
