package io.toolbox.cqengineext.storage

import java.util.concurrent.{Executor, Executors}
import java.util.concurrent.atomic.AtomicInteger
import akka.NotUsed
import akka.actor.{Actor, ActorSystem, Props}
import akka.stream.{ActorMaterializer, FlowShape}
import akka.stream.scaladsl.{Balance, Flow, GraphDSL, Merge, Sink, Source}
import io.toolbox.cqengineext.ConcurrentIndexedCollectionExt
import io.toolbox.cqengineext.storage.DataIngressionActor.{EndOfStream, LoadingCompleted}
import io.toolbox.parquet.{AvroParquetPartitionsIterator, ParquetTools}
import org.apache.avro.generic.GenericRecord
import scala.concurrent.{ExecutionContext, Future, Promise}

class CqShardedStorage(shardsNum: Int, schema: Map[String, String])
                      (indexes: Option[Map[String, String]]) {

  private val _shards = 1 to shardsNum map(i =>_shardInitialize)

  def shards = _shards

  def getShard(i: Int) =
    _shards(i)

  // count error and success insertion
  private val loadedSuccess = new AtomicInteger()
  private val loadedFailed = new AtomicInteger()
  private var loadingStartTime = None : Option[Long]
  private var loadingEndTime = None : Option[Long]

  def getShardsNum = _shards.length

  def getLoadedSuccessFailed = (loadedSuccess.get, loadedFailed.get)

  def getLoadingDuration = (loadingStartTime, loadingEndTime) match {
    case (Some(s), Some(e)) => Some((e - s)/1e6)
    case (Some(s), None) => Some((System.nanoTime - s)/1e6)
    case (_, _) => None
  }

  def loadData(source: Source[GenericRecord, NotUsed])
              (implicit ec: ExecutionContext, actorSystem: ActorSystem, materializer: ActorMaterializer)={

    val balance = balancer2(() => {
      val shard = getShardByRoundrobin
      Flow[GenericRecord].map((x) => {
        val rec = ParquetTools.convertGenericRecord2MapEntity(x)(schema)
        shard.add(rec) match {
          case true =>
            (1, 0)
          case false =>
            (0, 1)
        }
      })
    }, shardsNum)

    val sinkOut = Sink.foreach[(Int, Int)]{
      case (1, 0) =>
        val _t = loadedSuccess.incrementAndGet()
        if (_t % 100000 == 0) println(s"processed (success): ${_t}")
      case (0, 1) =>
        val _t = loadedFailed.incrementAndGet()
        if (_t % 1000 == 0) println(s"processed (failed): ${_t}")
    }

    loadingStartTime = Some(System.nanoTime)
    loadingEndTime = None

    // pipe: source ~> map(genericrec -> map) -> balancer(ingress to partition) -> count(success, errors)
    val f = source.via(balance).runWith(sinkOut)
    f.map(r => {
      loadingEndTime = Some(System.nanoTime)
      (getLoadingDuration.getOrElse(0d), loadedSuccess.get(), loadedFailed.get())
    })

  }

  private val _counter = new AtomicInteger()
  def getShardByRoundrobin =
    _shards(_counter.getAndIncrement() % shardsNum)

  private def _shardInitialize = {
    val shard = new ConcurrentIndexedCollectionExt(schemaDescription = schema)
    indexes map {i => shard.addIndexes(i)}
    shard
  }

  def balancer2[In, Out](getWorkerFlow: () => Flow[In, Out, Any], workerCount: Int): Flow[In, Out, NotUsed] = {
    import akka.stream.scaladsl.GraphDSL.Implicits._

    Flow.fromGraph(GraphDSL.create() { implicit b =>
      val balancer = b.add(Balance[In](workerCount, waitForAllDownstreams = true))
      val merge = b.add(Merge[Out](workerCount))

      for (_ <- 1 to workerCount) {
        balancer ~> getWorkerFlow().async ~> merge
      }

      FlowShape(balancer.in, merge.out)
    })
  }

}
