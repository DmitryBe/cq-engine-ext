package io.toolbox

import java.util.concurrent.atomic.AtomicInteger

import akka.NotUsed
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink}
import com.typesafe.config.ConfigFactory
import io.toolbox.cqengineext.{ConcurrentIndexedCollectionExt, CqEngineConvertors}
import io.toolbox.parquet.{AvroParquetPartitionsIterator, ParquetTools}
import org.apache.avro.generic.GenericRecord

import scala.concurrent.ExecutionContext

object ParquetLoaderMain extends App{

  implicit val ec = ExecutionContext.global
  implicit val actorSystem = ActorSystem("Test")
  implicit val materializer = ActorMaterializer()
  implicit val config = ConfigFactory.parseString("_test = test")
    .withFallback(ConfigFactory.load())

  val pathStr = config.getString("app.parquet-path")

  val partitions = 1
  val targetPartition = 0
  val storageBins = 10

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

  def getCounterFlow[T](logEvery: Int = 1000): Flow[T, T, NotUsed] ={
    val c = new AtomicInteger(0)
    Flow.fromFunction(rec => {
      val v = c.incrementAndGet()
      if (v % 1000 == 0) println(s"loaded ~: $v")
      rec
    })
  }

  scala.io.StdIn.readChar()
}
