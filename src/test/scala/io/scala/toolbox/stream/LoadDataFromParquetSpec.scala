package io.scala.toolbox.stream

import java.util
import java.util.concurrent.atomic.{AtomicBoolean, AtomicInteger}

import akka.NotUsed
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink, Source}
import com.googlecode.cqengine.entity.MapEntity
import com.typesafe.config.ConfigFactory
import io.toolbox.akka.stream.FlowActions
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


    implicit val hadoopConf = new Configuration()
    hadoopConf.set("fs.file.impl", "org.apache.hadoop.fs.LocalFileSystem")
    hadoopConf.set("fs.s3a.server-side-encryption-algorithm", "AES256")

    val cqSchema = ParquetTools.readParquetSchema(pathStr)
    val avro = new AvroParquetPartitionsIterator[GenericRecord](pathStr, partitions, targetPartition)
    val parquetSource = avro.toStreamSource

    val mapper = Flow[GenericRecord] map {r => CqEngineConvertors.convertGenericRecord2MapEntity(r)(cqSchema)}

    val stream = parquetSource via FlowActions.getCounterFlow(1000) via mapper to Sink.foreachParallel(storageBins)((rec) => {
      // do something with record
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

    val c = new AtomicInteger()
    var rec = reader.read()
    while (rec != null){

      val v = c.incrementAndGet()
      if (v % 1000 == 0) println(s"loaded ~: $v")

      if (c.get() < 500000)
        rec = reader.read()
      else
        rec = null
    }

    assert(true)
  }
}
