package io.scala.toolbox.cqengineext

import io.toolbox.cqengineext.parser.SqlParserExt
import io.toolbox.cqengineext.projection._
import io.toolbox.cqengineext.{FoldByKeyQuery, HistogramQuery, SQLCountQuery, SQLQuery}
import org.scalatest.{FlatSpec, Matchers}
import scala.collection.mutable

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

    import ExpCompiler.defaultCompiler

    val queryProjection = QueryProjection(
      resultColumns = Seq(
        StartColumn(),
        SimpleColumn("col1", Some("new_col1")),
        ExprColumn("""
                     |(row: scala.collection.mutable.Map[String, Any]) => {
                     |      import io.toolbox.cqengineext.projection.AnyValExt._
                     |      val c1 = row.getOrElse("col1", null).asInstanceOf[AnyVal]
                     |      val c2 = row.getOrElse("col2", null).asInstanceOf[AnyVal]
                     |      c1 + c2
                     |    }
                   """.stripMargin,
          "exp01_col"
        ),
        CaseColumn(
          WhenExpr(
            """
              |(row: scala.collection.mutable.Map[String, Any]) => {
              |      import io.toolbox.cqengineext.projection.AnyValExt._
              |      val c1 = row.getOrElse("col1", null).asInstanceOf[AnyVal]
              |      c1 < 10
              |    }
            """.stripMargin,
            """
              |(row: scala.collection.mutable.Map[String, Any]) => {
              |      import io.toolbox.cqengineext.projection.AnyValExt._
              |      7777
              |    }
            """.stripMargin
          ),
          Some(
            """
              |(row: scala.collection.mutable.Map[String, Any]) => {
              |      import io.toolbox.cqengineext.projection.AnyValExt._
              |      0
              |    }
            """.stripMargin),
          "case01_col"
        )
      )
    )

    val projectedRes = QueryProjector.project(result, queryProjection)
    assert(true)
  }

}
