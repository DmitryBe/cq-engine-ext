package io.toolbox.akka.stream

import java.util.concurrent.atomic.AtomicInteger

import akka.NotUsed
import akka.stream.FlowShape
import akka.stream.scaladsl.{Balance, Flow, GraphDSL, Merge}

object FlowActions {

  def getCounterFlow[T](logEvery: Int = 1000): Flow[T, T, NotUsed] ={
    val c = new AtomicInteger(0)
    Flow.fromFunction(rec => {
      val v = c.incrementAndGet()
      if (v % 1000 == 0) println(s"loaded ~: $v")
      rec
    })
  }

  def balancer[In, Out](worker: Flow[In, Out, Any], workerCount: Int): Flow[In, Out, NotUsed] = {
    import GraphDSL.Implicits._

    Flow.fromGraph(GraphDSL.create() { implicit b =>
      val balancer = b.add(Balance[In](workerCount, waitForAllDownstreams = true))
      val merge = b.add(Merge[Out](workerCount))

      for (_ <- 1 to workerCount) {
        // for each worker, add an edge from the balancer to the worker, then wire
        // it to the merge element
        balancer ~> worker.async ~> merge
      }

      FlowShape(balancer.in, merge.out)
    })
  }
}
