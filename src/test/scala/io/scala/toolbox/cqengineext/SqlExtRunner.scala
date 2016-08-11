package io.scala.toolbox.cqengineext

import java.util.concurrent.atomic.AtomicInteger

import akka.NotUsed
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink}
import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.typesafe.config.ConfigFactory
import io.toolbox.cqengineext.parser.ExtSqlParser
import io.toolbox.cqengineext.{ConcurrentIndexedCollectionExt, CqEngineConvertors, QueryRunner}
import io.toolbox.parquet.{AvroParquetPartitionsIterator, ParquetTools}
import org.apache.avro.generic.GenericRecord
import org.scalatest.{FlatSpec, Matchers}

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext}

class SqlExtRunner extends FlatSpec with Matchers{

  implicit val ec = ExecutionContext.global
  implicit val actorSystem = ActorSystem("Test")
  implicit val materializer = ActorMaterializer()

  implicit val config = ConfigFactory.parseString("_test = test")
    .withFallback(ConfigFactory.load())

  val pathStr = "/Users/dmitry/playground/data/test_1M" //config.getString("app.parquet-path")

  "parser ext" should "test1" in {

    val partitions = 2
    val targetPartition = 0
    val storageBins = 5

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

//    def _init = {
//      new ConcurrentIndexedCollection[java.util.Map[_, _]]()
//    }

    val storages = 1 to storageBins map(x => _init)
    val counter = new AtomicInteger()
    def getNextStorage = counter.getAndIncrement() % storageBins

    val avro = new AvroParquetPartitionsIterator[GenericRecord](pathStr, partitions, targetPartition)
    val parquetSource = avro.toStreamSource

    val mapper = Flow[GenericRecord] map {r => CqEngineConvertors.convertGenericRecord2MapEntity(r)(cqSchema)}

    val stream = parquetSource via getCounterFlow(1000) via mapper to Sink.foreachParallel(storageBins)((rec) => {
      storages(getNextStorage).add(rec)
    })
    stream.run()

    Thread.sleep(15000)

    // query runner
    val runner = QueryRunner.create(cqSchema)
    val ds00 = runner.query("select * from ds01 limit 10")(storages.head)
    val ds01 = runner.query("select * from ds01 order by sample_count desc limit 10")(storages.head)
    val f1 = runner.queryMultiple("select count(*) from ds01")(storages)
    val c01 = Await.result(f1, 5.seconds)

    assert(true)
  }

  def getCounterFlow[T](logEvery: Int = 1000): Flow[T, T, NotUsed] ={
    val c = new AtomicInteger(0)
    Flow.fromFunction(rec => {
      val v = c.incrementAndGet()
      if (v % 1000 == 0) println(s"loaded ~: $v")
      rec
    })
  }

}
