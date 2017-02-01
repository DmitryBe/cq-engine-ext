package io.toolbox.utils

object Utils {
  def time[R](unit: String = "ms")(block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    val execTime = t1 - t0
    val execTimeConverted = unit match {
      case "ns" => execTime
      case "mic" => execTime /1e3
      case "ms" => execTime /1e6
      case "sec" => execTime /1e9
      case _ => execTime
    }
    println(s"Elapsed time: $execTimeConverted $unit")
    result
  }
}
