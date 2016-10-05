package io.scala.toolbox.cqengineext

import akka.dispatch.ExecutionContexts
import io.toolbox.cqengineext.parser.SqlParserExt
import io.toolbox.cqengineext.projection._
import io.toolbox.cqengineext.{FoldByKeyQuery, HistogramQuery, SQLCountQuery, SQLQuery}
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

class ProjectionSpec extends FlatSpec with Matchers{

  val schema = Map(
    "chrom" -> "java.lang.String",
    "sample_count" -> "java.lang.Integer",
    "cadd_score" -> "java.lang.Float"
  )

  "projection" should "test1" in {

    val result = Seq(
      mutable.Map[String, Any]("col1" -> 1, "col2" -> 2, "col3" -> "c3"),
      mutable.Map[String, Any]("col1" -> 10, "col2" -> 20, "col3" -> "c30"),
      mutable.Map[String, Any]("col1" -> 100, "col2" -> 200, "col3" -> "c300")
    )

    implicit val ec = ExecutionContexts.global()
    import ExpCompiler.defaultCompiler

    val parser = SqlParserExt.create(schema)

    val f1Project = Future {
      val r0 = parser.parseQuery("select *, case when col1 < 10 then 0 else 1 end as expr10 from ds01").asInstanceOf[SQLQuery]
      QueryProjector.project(result, r0.columnsProjection)
    }

    val f2Project = Future {
      val r0 = parser.parseQuery("select *, case when col1 < 9 then 0 else 1 end as expr12 from ds01").asInstanceOf[SQLQuery]
      QueryProjector.project(result, r0.columnsProjection)
    }

    val f3Project = Future {
      val r0 = parser.parseQuery("select *, case when col1 < 8 then 0 else 1 end as expr11 from ds01").asInstanceOf[SQLQuery]
      QueryProjector.project(result, r0.columnsProjection)
    }

    val f = Future.sequence(Seq(f1Project, f2Project, f3Project))
    val r = Await.result(f, 10.seconds)

    assert(true)
  }

}
