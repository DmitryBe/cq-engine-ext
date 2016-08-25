package io.toolbox.cqengineext.storage

import java.util.concurrent.{Executor, Executors}
import java.util.concurrent.atomic.AtomicInteger

import akka.NotUsed
import akka.actor.{Actor, ActorSystem, Props}
import akka.dispatch.ForkJoinExecutorConfigurator
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

  // count error and success insertion
  val loadedSuccess = new AtomicInteger()
  val loadedFailed = new AtomicInteger()
  var loadingStartTime = None : Option[Long]
  var loadingEndTime = None : Option[Long]

  def getShardsNum = _shards.length

  def getLoadedSuccessFailed = (loadedSuccess.get, loadedFailed.get)

  def getLoadingDuration = (loadingStartTime, loadingEndTime) match {
    case (Some(s), Some(e)) => Some((e - s)/1e6)
    case (Some(s), None) => Some((System.nanoTime - s)/1e6)
    case (_, _) => None
  }

  def loadFromStream[SourceRecType](source: Source[SourceRecType, NotUsed])
                                   (mapper: (SourceRecType) => MapEntityEx, workerCount: Int = shardsNum)
                                   (dispatcherName: String)
                                   (implicit ec: ExecutionContext, actorSystem: ActorSystem, materializer: ActorMaterializer): Future[LoadingCompleted] ={

    val mapAction = Flow[SourceRecType] map {r => mapper(r)}

    // pool of data loading actors
    val endStreamPromise = Promise[EndOfStream]()

    val dataIngressActorProp = DataIngressionActor.props(getShardByRoundrobin _)(loadedSuccess, loadedFailed)(endStreamPromise).withDispatcher(dispatcherName)
    val routerActorProp = RoundRobinPool(shardsNum).props(dataIngressActorProp).withDispatcher(dispatcherName)

    // stream sink
    val sink = Sink.actorRef(actorSystem.actorOf(routerActorProp), onCompleteMessage = EndOfStream())

    // pipe
    val stream = source
      .via(FlowActions.getCounterFlow(10000))
      .via(FlowActions.balancer(mapAction, workerCount))
      .to(sink)

    // start
    loadingStartTime = Some(System.nanoTime)
    loadingEndTime = None
    stream.run()

    // subscribe for end
    endStreamPromise.future map { r =>
      loadingEndTime = Some(System.nanoTime)
      LoadingCompleted(getLoadingDuration.getOrElse(0), loadedSuccess.get, loadedFailed.get)
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
