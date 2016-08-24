package io.scala.toolbox.cqengineext

import com.googlecode.cqengine.entity.MapEntity
import com.googlecode.cqengine.query.parser.sql.SQLParser
import io.toolbox.cqengineext.{FoldByKeyQuery, HistogramQuery, SQLCountQuery, SQLQuery}
import io.toolbox.cqengineext.parser.SqlParserExt
import io.toolbox.cqengineext.projection.{CaseColumn, ExprColumn, SimpleColumn, StartColumn}
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

  "parser projection" should "" in {

    val parser = SqlParserExt.create(schema)

    val r0 = parser.parseQuery("select * from ds01").asInstanceOf[SQLQuery]
    assert(r0.columnsProjection.length == 1)
    assert(r0.columnsProjection.resultColumns.head.isInstanceOf[StartColumn])

    val r1 = parser.parseQuery("select col1, col2 from ds01").asInstanceOf[SQLQuery]
    assert(r1.columnsProjection.length == 2)
    assert(r1.columnsProjection.resultColumns.map {c => c.isInstanceOf[SimpleColumn]}.count(x => x == true) == 2)

    val r2 = parser.parseQuery("select col1 - col2 as c1, col3 from ds01").asInstanceOf[SQLQuery]
    assert(r2.columnsProjection.length == 2)
    assert(r2.columnsProjection.resultColumns.map {c => c.isInstanceOf[SimpleColumn]}.count(x => x == true) == 1)
    assert(r2.columnsProjection.resultColumns.map {c => c.isInstanceOf[ExprColumn]}.count(x => x == true) == 1)

    val r3 = parser.parseQuery("select *, col1 as c1, (col1 - col2) / 5 as c2 from ds01").asInstanceOf[SQLQuery]
    assert(r3.columnsProjection.length == 3)
    assert(r3.columnsProjection.resultColumns.map {c => c.isInstanceOf[StartColumn]}.count(x => x == true) == 1)
    assert(r3.columnsProjection.resultColumns.map {c => c.isInstanceOf[SimpleColumn]}.count(x => x == true) == 1)
    assert(r3.columnsProjection.resultColumns.map {c => c.isInstanceOf[ExprColumn]}.count(x => x == true) == 1)

    val r4 = parser.parseQuery(
      """
        |select *,
        |       col1 as c1,
        |       case when col1 == 1 then 1 when col1 == 2 then 2 else 0 end as expr1,
        |       case when col2 == 2 then 2 when col2 == 4 then 4 end as expr2
        |       from ds01
      """.stripMargin).asInstanceOf[SQLQuery]
    assert(r4.columnsProjection.length == 4)
    assert(r4.columnsProjection.resultColumns.map {c => c.isInstanceOf[StartColumn]}.count(x => x == true) == 1)
    assert(r4.columnsProjection.resultColumns.map {c => c.isInstanceOf[SimpleColumn]}.count(x => x == true) == 1)
    assert(r4.columnsProjection.resultColumns.map {c => c.isInstanceOf[CaseColumn]}.count(x => x == true) == 2)

    assert(true)
  }

}
