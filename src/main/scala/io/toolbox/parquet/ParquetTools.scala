package io.toolbox.parquet

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

  def convertSchema2CQEngineExtSchema(schema: Schema): Map[String, String] ={
    schema.getFields.map { f =>
      val name = f.name()
      val fieldTypes = f.schema().getTypes
      val v = fieldTypes.map(x => x.getName) match {
        case x if x.contains("string") => "java.lang.String"
        case x if x.contains("int") => "java.lang.Integer"
        case x if x.contains("float") => "java.lang.Float"
        case x if x.contains("boolean") => "java.lang.Boolean"
        case _ => throw new Exception("unsupported type")
      }
      name -> v
    }.toMap
  }

}
