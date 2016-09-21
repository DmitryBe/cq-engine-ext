package io.toolbox.parquet

import java.util
import io.toolbox.cqengineex.ex.MapEntityEx
import org.apache.avro.Schema
import org.apache.avro.generic.GenericRecord
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import parquet.avro.AvroParquetReader
import scala.collection.JavaConversions._

object ParquetTools {

  def readParquetSchema(parquetPath: String)
                       (implicit hadoopConfig: Configuration): Map[String, String] ={

    val path = new Path(parquetPath)
    val reader = AvroParquetReader.builder[GenericRecord](path)
      .withConf(hadoopConfig)
      .build()

    val rec = reader.read()
    val schema = rec.getSchema
    reader.close()
    convertSchema2CQEngineExtSchema(schema)
  }

  def convertGenericRecord2MapEntity(rec: GenericRecord)
                                    (schema: Map[String, String]): MapEntityEx ={

    val mRec = new util.HashMap[String, Any]()
    schema foreach { field =>

      val v = rec.get(field._1)
      if (hasValue(v)){
        mRec.put(field._1, convert(v))
      }
      else
        mRec.put(field._1, getDefaultValue(field._2))
    }

    new MapEntityEx(mRec)
  }

  private def convertSchema2CQEngineExtSchema(schema: Schema): Map[String, String] ={
    schema.getFields.map { f =>
      val name = f.name()
      val fieldTypes = f.schema().getTypes
      val v = fieldTypes.map(x => x.getName) match {
        case x if x.contains("string") => "java.lang.String"
        case x if x.contains("int") => "java.lang.Integer"
        case x if x.contains("float") => "java.lang.Float"
        case x if x.contains("double") => "java.lang.Double"
        // store bool as int
        case x if x.contains("boolean") => "java.lang.Integer"
        case _ => throw new Exception("unsupported type")
      }
      name -> v
    }.toMap
  }

  private def hasValue(v: AnyRef) = v != null

  private def convert(v: Any): Any = {
    if (v.isInstanceOf[Boolean])
      if(v.asInstanceOf[Boolean]) 1 else 0
    else
      v
  }

  private def getDefaultValue(sType: String): Any ={
    sType match {
      case "java.lang.String" => ""
      case "java.lang.Integer" => 0
      case "java.lang.Float" => java.lang.Float.MIN_VALUE
      case "java.lang.Double" => java.lang.Double.MIN_VALUE
      // replaced bool with int
      //        case "java.lang.Boolean" => false
      case _ => throw new Exception(s"unsupported type: $sType")
    }
  }

}
