package io.scala.toolbox.cqengineext

import com.googlecode.cqengine.entity.MapEntity
import com.googlecode.cqengine.query.parser.sql.SQLParser
import io.toolbox.cqengineext.{FoldByKeyQuery, HistogramQuery, SQLCountQuery, SQLQuery}
import io.toolbox.cqengineext.parser.SqlParserExt
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

  "parser ext" should "test1" in {

    val parser = SqlParserExt.create(schema)
    val r1 = parser.parseQuery("select * from ds01 order by chrom asc limit 10")
    assert(r1.isInstanceOf[SQLQuery])

    val r2 = parser.parseQuery("select count(*) from ds01")
    assert(r2.isInstanceOf[SQLCountQuery])

    val r3 = parser.parseQuery("select chrom, count(*) from ds01 group by chrom")
    assert(r3.isInstanceOf[FoldByKeyQuery])

    val r4 = parser.parseQuery("select histogram(20) from ds01")
    assert(r4.isInstanceOf[HistogramQuery])

    assert(true)
  }

}
