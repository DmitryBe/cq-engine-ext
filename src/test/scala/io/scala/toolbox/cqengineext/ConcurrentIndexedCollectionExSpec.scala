package io.scala.toolbox.cqengineext

import com.googlecode.cqengine.entity.MapEntity
import org.scalatest.{FlatSpec, Matchers}
import collection.JavaConverters._
import scala.collection.JavaConversions._

//class ConcurrentIndexedCollectionExSpec extends FlatSpec with Matchers{
//
//  val schema = Map(
//    "name" -> "java.lang.String",
//    "age" -> "java.lang.Integer",
//    "subscribed" -> "java.lang.Boolean"
//  )
//  val indexes = Map(
//    "name" -> "NavigableIndex",
//    "age" -> "NavigableIndex"
//  )
//
//  val collection = new ConcurrentIndexedCollectionEx(schemaDescription = schema)
//    .addIndexes(indexes)
//
//  addSomeTestData()
//
//  "indexed collection ext" should "query" in {
//
//    val res = collection.query("select * from ds01 order by age asc")
//    val ds = res.toList
//    assert(ds.length == 1)
//  }
//
//  "indexed collection ext" should "count" in {
//
//    val count = collection.count("select * from ds01")
//    assert(count == 3)
//  }
//
//  "indexed collection ext" should "foldby1" in {
//
//    val gRes1 = collection.foldBy("subscribed", "select * from ds01")
//  }
//
//  "indexed collection ext" should "foldby3" in {
//
//    val gRes2 = collection.foldBy2("name", "age", "select * from ds01")
//  }
//
//  "indexed collection ext" should "sumby" in {
//
//    val r = collection.sumBy("age", "select * from ds01")
//    val sum = r._1
//    val count = r._2
//    val avg = sum / count
//
//  }
//
//  private def addSomeTestData(): Unit ={
//
//    collection.add(new MapEntity(Map(
//      "name" -> "Dmitry",
//      "age" -> 32,
//      "subscribed" -> true
//    )))
//
//    collection.add(new MapEntity(Map(
//      "name" -> "Maria",
//      "age" -> 28,
//      "subscribed" -> true
//    )))
//
//    collection.add(new MapEntity(Map(
//      "name" -> "Patrick",
//      "subscribed" -> true
//    )))
//  }
//
//}
