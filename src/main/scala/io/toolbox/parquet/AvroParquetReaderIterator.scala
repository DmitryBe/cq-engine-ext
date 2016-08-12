package io.toolbox.parquet

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import parquet.avro.AvroParquetReader
import parquet.hadoop.ParquetReader

class AvroParquetReaderIterator[T] extends Iterator[T]{

  var _reader : ParquetReader[T] = null
  var _nextRec = None : Option[T]
  var _hasRead = false

  def this(reader: ParquetReader[T]){
    this()
    _reader = reader
  }

  override def hasNext: Boolean = {
    _hasRead match {
      case false =>
        _hasRead = true
        _nextRec = Option(_reader.read())
        _nextRec.isDefined
      case true => _nextRec.isDefined
    }
  }

  override def next(): T = {
    _hasRead = false
    _nextRec.get
  }
}

object AvroParquetReaderIterator {

  def createFromParquetReader[T](reader: ParquetReader[T]) = new AvroParquetReaderIterator(reader)

  def createFromParquetFile[T <: org.apache.avro.generic.IndexedRecord](parquetPath: String)
                                                                       (implicit hadoopConf: Configuration): AvroParquetReaderIterator[T] ={

    val path = new Path(parquetPath)
    val reader = AvroParquetReader.builder[T](path)
      .withConf(hadoopConf)
      .build()

    createFromParquetReader(reader)
  }
}