package io.toolbox.cqengineext

import java.util

import com.googlecode.cqengine.entity.MapEntity
import org.apache.avro.generic.GenericRecord

object CqEngineConvertors {

  def convertGenericRecord2MapEntity(rec: GenericRecord)
                                    (schema: Map[String, String]): MapEntity ={

    val mRec = new util.HashMap[String, Any]()
    schema foreach { field =>

      val v = rec.get(field._1)
      if (v != null)
        mRec.put(field._1, v)
      else
        mRec.put(field._1, getDefaultValue(field._2))
    }

    new MapEntity(mRec)
  }

  def getDefaultValue(sType: String): Any ={
    sType match {
        case "java.lang.String" => ""
        case "java.lang.Integer" => 0
        case "java.lang.Float" => java.lang.Float.MIN_VALUE
        case "java.lang.Double" => java.lang.Double.MIN_VALUE
        case "java.lang.Boolean" => false
        case _ => throw new Exception(s"unsupported type: $sType")
      }
  }

}
