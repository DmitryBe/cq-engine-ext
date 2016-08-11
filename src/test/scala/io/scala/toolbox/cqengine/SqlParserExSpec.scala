package io.scala.toolbox.cqengine

import com.googlecode.cqengine.entity.MapEntity
import com.googlecode.cqengine.query.parser.sql.SQLParser
import io.scala.toolbox.cqengine.parser.{ExtSqlParser}
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.JavaConversions._

class SqlParserExSpec extends FlatSpec with Matchers{

  val schema = Map(
    "chrom" -> "java.lang.String",
    "sample_count" -> "java.lang.Integer",
    "cadd_score" -> "java.lang.Float"
  )
  val indexes = Map(
    "sample_count" -> "NavigableIndex"
  )

//  val collection = new ConcurrentIndexedCollectionEx(schemaDescription = schema)
//    .addIndexes(indexes)
//
//  addSomeTestData()

  "parser ext" should "test1" in {

    assert(true)

    val parser = ExtSqlParser.create(schema)
    val r1 = parser.parseQuery("select * from ds01 order by chrom asc limit 10")
    val r2 = parser.parseQuery("select count(*) from ds01")
    val r3 = parser.parseQuery("select chrom, count(*) from ds01 group by chrom")
    val r4 = parser.parseQuery("select histogram(20) from ds01")

    assert(true)
  }

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

}
