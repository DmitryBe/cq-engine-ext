package io.scala.toolbox.cqengineext

import java.util
import java.util.concurrent.atomic.AtomicInteger

import akka.NotUsed
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink}
import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.googlecode.cqengine.attribute.{Attribute, SimpleAttribute, SimpleNullableMapAttribute}
import com.googlecode.cqengine.index.Index
import com.googlecode.cqengine.index.navigable.NavigableIndex
import com.googlecode.cqengine.query.QueryFactory._
import com.googlecode.cqengine.query.option.EngineThresholds._
import com.googlecode.cqengine.query.option.{AttributeOrder, OrderByOption, QueryOptions}
import com.googlecode.cqengine.query.parser.sql.SQLParser
import com.typesafe.config.ConfigFactory
import io.toolbox.akka.stream.FlowActions
import io.toolbox.cqengineext._
import io.toolbox.parquet.{AvroParquetPartitionsIterator, ParquetTools}
import org.apache.avro.generic.GenericRecord
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.JavaConversions._
import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext}
import com.googlecode.cqengine.query.QueryFactory._

class SqlExtRunner extends FlatSpec with Matchers{

  implicit val ec = ExecutionContext.global
  implicit val actorSystem = ActorSystem("Test")
  implicit val materializer = ActorMaterializer()

  implicit val config = ConfigFactory.parseString("_test = test")
    .withFallback(ConfigFactory.load())

  val pathStr = "/Users/dmitry/playground/data/test_1M" //config.getString("app.parquet-path")

  "runner" should "read and query test" in {

    val partitions = 1
    val targetPartition = 0
    val storageBins = 5

    // read parquet schema
    val cqSchema = ParquetTools.readParquetSchema(pathStr)

    def _init = {
      new ConcurrentIndexedCollectionExt(schemaDescription = cqSchema)
        .addIndexes(Map(
          "cadd_score" -> "NavigableIndex",
          "sample_count" -> "NavigableIndex",
          "hli_allele_frequency" -> "NavigableIndex",
          "gene_name" -> "NavigableIndex"
        ))
    }

    val storages = 1 to storageBins map(x => _init)
    val counter = new AtomicInteger()
    def getNextStorage = counter.getAndIncrement() % storageBins

    val avro = new AvroParquetPartitionsIterator[GenericRecord](pathStr, partitions, targetPartition)
    val parquetSource = avro.toStreamSource

    val mapper = Flow[GenericRecord] map {r => CqEngineConvertors.convertGenericRecord2MapEntity(r)(cqSchema)}

    val stream = parquetSource
      .via(FlowActions.getCounterFlow(1000))
      .via(mapper)
      .to(Sink.foreachParallel(storageBins)((rec) => {
          storages(getNextStorage).add(rec)
        }))
    stream.run()

    Thread.sleep(30000)

    // query runner
    val runner = SqlQueryRunner.create(cqSchema)
    val c01 = Await.result(runner.queryMultipleT[QueryCountResult]("select count(*) from ds01")(storages), 10.seconds)

    val ds01 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by sample_count asc limit 10")(storages), 10.seconds)
        .result.map(x => x.get("sample_count").asInstanceOf[java.lang.Integer])

    val ds02 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by sample_count desc limit 10")(storages), 10.seconds)
        .result.map(x => x.get("sample_count").asInstanceOf[java.lang.Integer])

    val ds11 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by cadd_score asc limit 10")(storages), 10.seconds)
        .result.map(x => x.get("cadd_score").asInstanceOf[java.lang.Float])

    val ds12 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by cadd_score desc limit 10")(storages), 10.seconds)
        .result.map(x => x.get("cadd_score").asInstanceOf[java.lang.Float])

    val ds21 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by gene_name desc limit 10")(storages), 10.seconds)
        .result.map(x => x.get("gene_name").asInstanceOf[java.lang.String])

    val ds22 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 order by gene_name asc limit 10")(storages), 10.seconds)
      .result.map(x => x.get("gene_name").asInstanceOf[java.lang.String])

    val ds31 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 where gene_name in ('MORN5', 'MERTK') order by cadd_score desc limit 10")(storages), 10.seconds)
    val ds32 = Await.result(runner.queryMultipleT[QueryDataSetResult]("select * from ds01 where gene_name not in ('MORN5', 'MERTK') order by cadd_score desc limit 10")(storages), 10.seconds)

    assert(true)
  }

}
