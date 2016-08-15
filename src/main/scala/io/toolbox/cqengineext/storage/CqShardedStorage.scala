package io.toolbox.cqengineext.storage

import java.util.concurrent.atomic.AtomicInteger

import akka.NotUsed
import akka.actor.{Actor, ActorSystem, Props}
import akka.routing.RoundRobinPool
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Flow, Sink, Source}
import io.toolbox.akka.stream.FlowActions
import io.toolbox.cqengineex.ex.MapEntityEx
import io.toolbox.cqengineext.ConcurrentIndexedCollectionExt
import io.toolbox.cqengineext.storage.DataIngressionActor.{EndOfStream, LoadingCompleted}

import scala.concurrent.{ExecutionContext, Future, Promise}

class CqShardedStorage(shardsNum: Int, schema: Map[String, String])
                      (indexes: Option[Map[String, String]]) {

  private val _shards = 1 to shardsNum map(i =>_shardInitialize)

  def shards = _shards

  def getShard(i: Int) =
    _shards(i)

  def loadFromStream[SourceRecType](source: Source[SourceRecType, NotUsed])
                                   (mapper: (SourceRecType) => MapEntityEx)
                                   (implicit ec: ExecutionContext, actorSystem: ActorSystem, materializer: ActorMaterializer): Future[LoadingCompleted] ={

    val mapAction = Flow[SourceRecType] map {r => mapper(r)}

    // count error and success insertion
    val loadedSuccess = new AtomicInteger()
    val loadedFailed = new AtomicInteger()

    // pool of data loading actors
    val endStreamPromise = Promise[EndOfStream]()
    val shardLoadingActors = actorSystem.actorOf(RoundRobinPool(shardsNum).props(
      DataIngressionActor.props(getShardByRoundrobin _)(loadedSuccess, loadedFailed)(endStreamPromise)
    ))

    // stream sink
    val sink = Sink.actorRef(shardLoadingActors, onCompleteMessage = EndOfStream())

    // pipe
    val stream = source
      .via(FlowActions.getCounterFlow(1000))
      .via(FlowActions.balancer(mapAction, shardsNum))
      .to(sink)

    // start
    val startTime = System.nanoTime
    stream.run()

    // subscribe for end
    endStreamPromise.future map { r =>
      val durationMs = (System.nanoTime - startTime)/1e6
      LoadingCompleted(durationMs, loadedSuccess.get, loadedFailed.get)
    }
  }

  private val _counter = new AtomicInteger()
  def getShardByRoundrobin =
    _shards(_counter.getAndIncrement() % shardsNum)

  private def _shardInitialize = {
    val shard = new ConcurrentIndexedCollectionExt(schemaDescription = schema)
    indexes map {i => shard.addIndexes(i)}
    shard
  }
}
