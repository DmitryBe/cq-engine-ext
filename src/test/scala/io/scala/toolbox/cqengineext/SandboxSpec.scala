package io.scala.toolbox.cqengineext

import java.util
import com.googlecode.cqengine.ConcurrentIndexedCollection
import com.googlecode.cqengine.entity.MapEntity
import io.toolbox.cqengineex.ex.MapEntityEx
import io.toolbox.cqengineext.parser.SqlParserExt
import io.toolbox.cqengineext.projection.{CaseColumn, ExprColumn, SimpleColumn, StartColumn}
import io.toolbox.cqengineext.{FoldByKeyQuery, HistogramQuery, SQLCountQuery, SQLQuery}
import org.scalatest.{FlatSpec, Matchers}
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

class SandboxSpec extends FlatSpec with Matchers{

  val schema = Map(
    "name" -> "java.lang.String",
    "b1" -> "java.lang.Boolean",
    "i1" -> "java.lang.Integer"
  )
  val indexes = Map(
    "sample_count" -> "NavigableIndex"
  )

  "parser ext" should "test1" in {

    val collection = new ConcurrentIndexedCollection[util.Map[_, _]]

    val data = 1 to 10 map { i =>
      val mRec = new util.HashMap[String, Any]()
      mRec.put("name", s"name-$i")
      val isTrue = if (i % 2 == 0) true else false
      mRec.put("b1", isTrue)
      mRec.put("i1", if(isTrue) 1 else 0)
      new MapEntityEx(mRec)
    }
    data foreach { d =>
      collection.add(d)
    }

    val parser = SqlParserExt.create(schema)
    val r = parser.parse("select * from ds where i1 = 1")
    val q = r.getQuery
    val result = collection.retrieve(q) toList


    //val e = new MapEntityEx()

    //val e = new java.util.Map[_, _]()
    //collection.add(new MapEntity(e))

    assert(true)
  }

}
