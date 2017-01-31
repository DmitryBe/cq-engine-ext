package io.scala.toolbox.cqengineext

import java.util
import java.util.concurrent.atomic.{AtomicInteger, AtomicLong}

import akka.NotUsed
import akka.actor.{Actor, ActorSystem, Props}
import akka.routing.RoundRobinPool
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink, Source}
import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.googlecode.cqengine.attribute.{Attribute, SimpleAttribute, SimpleNullableMapAttribute}
import com.googlecode.cqengine.entity.MapEntity
import com.googlecode.cqengine.index.Index
import com.googlecode.cqengine.index.navigable.NavigableIndex
import com.googlecode.cqengine.query.QueryFactory._
import com.googlecode.cqengine.query.option.EngineThresholds._
import com.googlecode.cqengine.query.option.{AttributeOrder, OrderByOption, QueryOptions}
import com.googlecode.cqengine.query.parser.sql.SQLParser
import com.typesafe.config.ConfigFactory
import io.toolbox.akka.stream.FlowActions
import io.toolbox.cqengineext._
import io.toolbox.parquet.{AvroParquetPartitionsIterator, AvroParquetReaderIterator, ParquetTools}
import org.apache.avro.generic.GenericRecord
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.JavaConversions._
import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future, Promise}
import com.googlecode.cqengine.query.QueryFactory._
import io.toolbox.collections.CollectionHelper
import io.toolbox.cqengineext.storage.CqShardedStorage
import org.apache.hadoop.conf.Configuration

class SqlExtRunnerSpec extends FlatSpec with Matchers{

  implicit val ec = ExecutionContext.global
  implicit val actorSystem = ActorSystem("Test")
  implicit val materializer = ActorMaterializer()

  implicit val config = ConfigFactory.parseString("_test = test")
    .withFallback(ConfigFactory.load())

  val pathStr = "/Users/dmitry/playground/test_1M_10_partitions" //config.getString("app.parquet-path")
//  val pathStr = "/Users/dmitry/playground/data/y2016m08d10-8951a838ac8c18ea159ea43c6f02c569.parquet"

  val indexes = Map(
    "cadd_score" -> "NavigableIndex",
    "sample_count" -> "NavigableIndex",
    "hli_allele_frequency" -> "NavigableIndex",
    "gene_name" -> "NavigableIndex",
    "cohort_allele_frequency" -> "NavigableIndex"
  )

  "load from stream, index and query" should "" in {

    implicit val hadoopConf = new Configuration()
    hadoopConf.set("fs.file.impl", "org.apache.hadoop.fs.LocalFileSystem")
    hadoopConf.set("fs.s3a.server-side-encryption-algorithm", "AES256")

    // read parquet schema
    val cqSchema = ParquetTools.readParquetSchema(pathStr)

    val shards = 10
    val storage = new CqShardedStorage(shards, cqSchema)(Some(indexes))

    val parquetPartitionsTotal = 1
    val parquetPartitionTarget = 0
    val avro = new AvroParquetPartitionsIterator[GenericRecord](pathStr, parquetPartitionsTotal, parquetPartitionTarget)
    val parquetSource = avro.toStreamSource
//    val sourceSingleFile = Source.fromIterator(() => AvroParquetReaderIterator.createFromParquetFile[GenericRecord](pathStr))

    implicit val loadDataDispatcher = actorSystem.dispatchers.defaultGlobalDispatcher
    implicit val loadingDataExecContext = loadDataDispatcher.prepare()

    val f = storage.loadData(parquetSource)(loadingDataExecContext, actorSystem, materializer) map { res =>
      val (loadedSec, success, failed) = res
      print(s"data loaded; duration $loadedSec sec; success: $success, failed: $failed")
      queryTests(cqSchema, storage)
    } recover {
      case e: Throwable =>
        println(s"error: ${e.getMessage}")
    }

    Await.ready(f, 100.seconds)
  }

  def queryTests(cqSchema: Map[String, String], storage: CqShardedStorage): Unit ={

    val maxExecTime = 100.seconds

    // query runner
    val runner = SqlQueryRunner.create(cqSchema)
    val c01 = Await.result(runner.queryMultipleT[QueryCountResult]("select count(*) from ds01")(storage.shards), maxExecTime)
    val c02 = Await.result(runner.queryMultipleT[QueryCountDistinctResult]("select count(distinct chrom, pos) from ds01")(storage.shards), maxExecTime).count
    val c03 = Await.result(runner.queryMultipleT[QueryCountDistinctHllResult]("select count(hll distinct chrom, pos) from ds01")(storage.shards), maxExecTime).count

    val d1001 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 where high_conf_region = 0 limit 100")(storage.shards), maxExecTime)
      .result.map(x => x.get("high_conf_region").asInstanceOf[java.lang.Integer])

//    val rr01 = Await.result(runner.queryMultipleT[QueryCountResult]("select sample_count, cadd_score from ds01")(storage.shards), maxExecTime)
//    assert(false)

    val ds011 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select sample_count, cadd_score, case when cadd_score < 5 then 5 else 10 end as exp01 from ds01 order by cadd_score asc limit 100")(storage.shards), maxExecTime)
    val ds012 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select *, case when sample_count == 1 then 100 else sample_count end as exp01 from ds01 limit 100")(storage.shards), maxExecTime)

    val ds01 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by sample_count asc limit 100")(storage.shards), maxExecTime)
        .result.map(x => x.get("sample_count").asInstanceOf[java.lang.Integer])
    assert(CollectionHelper.isOrdered[java.lang.Integer](ds01)((a,b) => a <= b))

    val ds02 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by sample_count desc limit 100")(storage.shards), maxExecTime)
      .result.map(x => x.get("sample_count").asInstanceOf[java.lang.Integer])
    assert(CollectionHelper.isOrdered[java.lang.Integer](ds01)((a,b) => a >= b))

    val ds11 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by cadd_score asc limit 100")(storage.shards), maxExecTime)
      .result.map(x => x.get("cadd_score").asInstanceOf[java.lang.Float])
    assert(CollectionHelper.isOrdered[java.lang.Float](ds11)((a,b) => a <= b))

    val ds12 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by cadd_score desc limit 100")(storage.shards), maxExecTime)
      .result.map(x => x.get("cadd_score").asInstanceOf[java.lang.Float])
    assert(CollectionHelper.isOrdered[java.lang.Float](ds11)((a,b) => a >= b))

    val ds21 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by gene_name desc limit 100")(storage.shards), maxExecTime)
      .result.map(x => x.get("gene_name").asInstanceOf[String])

    val ds22 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by gene_name asc limit 100")(storage.shards), maxExecTime)
      .result.map(x => x.get("gene_name").asInstanceOf[String])

    val ds31 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 where gene_name in ('MORN5', 'MERTK') order by cadd_score desc limit 10")(storage.shards), maxExecTime)
    val ds32 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 where gene_name not in ('MORN5', 'MERTK') order by cadd_score desc limit 10")(storage.shards), maxExecTime)

    assert(true)
  }

}
