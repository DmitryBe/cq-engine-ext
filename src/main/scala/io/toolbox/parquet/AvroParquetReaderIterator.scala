package io.toolbox.parquet

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
  def create[T](reader: ParquetReader[T]) = new AvroParquetReaderIterator(reader)
}