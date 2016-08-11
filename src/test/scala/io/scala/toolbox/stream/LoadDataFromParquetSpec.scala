package io.scala.toolbox.stream

import java.util
import java.util.concurrent.atomic.{AtomicBoolean, AtomicInteger}

import akka.NotUsed
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink, Source}
import com.googlecode.cqengine.entity.MapEntity
import com.typesafe.config.ConfigFactory
import io.toolbox.cqengineext.{ConcurrentIndexedCollectionExt, CqEngineConvertors}
import io.toolbox.parquet.{AvroParquetPartitionsIterator, ParquetTools}
import org.apache.avro.Schema
import org.apache.avro.generic.GenericRecord
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import org.scalatest.{FlatSpec, Matchers}
import parquet.avro.AvroParquetReader

import collection.JavaConverters._
import scala.collection.JavaConversions._
import scala.collection.mutable
import scala.concurrent.ExecutionContext

class LoadDataFromParquetSpec extends FlatSpec with Matchers{

  implicit val ec = ExecutionContext.global
  implicit val actorSystem = ActorSystem("Test")
  implicit val materializer = ActorMaterializer()

  implicit val config = ConfigFactory.parseString("_test = test")
    .withFallback(ConfigFactory.load())

  val pathStr = config.getString("app.parquet-path")

  "load from parquet" should "using akka stream" in {

    val partitions = 4
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

    Thread.sleep(60000)
    assert(true)
  }

  "load from parquet" should "using AvroParquetReader" in {

    val path = new Path(pathStr)
    val conf = new Configuration()
    val reader = AvroParquetReader.builder[GenericRecord](path)
      .withConf(conf)
      .build()

    var rec = reader.read()
    val schema = rec.getSchema
    val cqSchema = ParquetTools.convertSchema2CQEngineExtSchema(schema)
    val collection = new ConcurrentIndexedCollectionExt(schemaDescription = cqSchema)
      .addIndexes(Map(
        "cadd_score" -> "NavigableIndex",
        "sample_count" -> "NavigableIndex",
        "hli_allele_frequency" -> "NavigableIndex",
        "gene_name" -> "NavigableIndex"
      ))

    val c = new AtomicInteger()
    while (rec != null){

      val v = c.incrementAndGet()
      if (v % 1000 == 0) println(s"loaded ~: $v")

      val r = CqEngineConvertors.convertGenericRecord2MapEntity(rec)(cqSchema)
//      collection.addElement(r.toMap)

      if (c.get() < 500000)
        rec = reader.read()
      else
        rec = null
    }

//    val count = collection.count("select * from ds1")
//    val ds1 = collection.query("select * from ds1").take(10)
//    val ds2 = collection.query("select * from ds1 where cadd_score > 3").take(10)
//    val ds3 = collection.query("select * from ds1 where sample_count < 5").take(10)
//    val ds4 = collection.query("select * from ds1 where gene_name not in ('LINC00900-BUD13')").take(10)
//    val g1 = collection.foldBy("chrom", "select * from ds1")

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
