package io.toolbox.cqengineext.storage

import java.util.concurrent.atomic.AtomicInteger
import akka.actor.{Actor, Props}
import io.toolbox.cqengineex.ex.MapEntityEx
import io.toolbox.cqengineext.ConcurrentIndexedCollectionExt
import io.toolbox.cqengineext.storage.DataIngressionActor.EndOfStream
import scala.concurrent.Promise
import scala.util.Try

@deprecated
object DataIngressionActor {

  def props(getShard: ()=> ConcurrentIndexedCollectionExt)
           (loadedSuccess: AtomicInteger, loadedFailed: AtomicInteger)
           (endPromise: Promise[EndOfStream]) = Props(new DataIngressionActor(getShard)(loadedSuccess, loadedFailed)(endPromise))

  case class EndOfStream()
  case class LoadingCompleted(durationMs: Double, loadedSucces: Int, loadedFailed: Int)
}

@deprecated
protected class DataIngressionActor(getShard: () => ConcurrentIndexedCollectionExt)
                                   (loadedSuccess: AtomicInteger, loadedFailed: AtomicInteger)
                                   (endPromise: Promise[EndOfStream]) extends Actor with akka.actor.ActorLogging{

  val shard = getShard()

  @scala.throws[Exception](classOf[Exception])
  override def preStart(): Unit = {
    log.debug("started")
  }

  @scala.throws[Exception](classOf[Exception])
  override def postStop(): Unit = {
    log.debug("stopped")
  }

  def receive = {
    case msg: MapEntityEx =>
      Try(shard.add(msg)).getOrElse(false) match {
        case true => loadedSuccess.incrementAndGet()
        case false =>
          log.warning(s"total failed: ${loadedFailed.incrementAndGet()}")
      }

    case msg: EndOfStream =>
      endPromise.success(msg)
  }
}
