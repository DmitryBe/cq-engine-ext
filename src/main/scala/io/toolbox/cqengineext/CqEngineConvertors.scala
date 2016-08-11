package io.toolbox.cqengineext

import java.util

import com.googlecode.cqengine.entity.MapEntity
import org.apache.avro.generic.GenericRecord

object CqEngineConvertors {

  def convertGenericRecord2MapEntity(rec: GenericRecord, includeNullVals: Boolean = true)
                                    (schema: Map[String, String]): MapEntity ={

    val mRec = new util.HashMap[String, Object]()
    schema foreach { field =>

      val v = rec.get(field._1)
      includeNullVals match {
        case true =>
          mRec.put(field._1, v)
        case false =>
          if (v != null)
            mRec.put(field._1, v)
      }
    }
    new MapEntity(mRec)
  }

}
