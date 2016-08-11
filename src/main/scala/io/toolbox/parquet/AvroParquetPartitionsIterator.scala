package io.toolbox.parquet

import akka.stream.scaladsl.Source
import io.toolbox.hdfs.HdfsHelper
import org.apache.avro.generic.IndexedRecord
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import parquet.avro.AvroParquetReader

class AvroParquetPartitionsIterator[T <: IndexedRecord](parquetRootPath: String, partitions: Int, targetPartition: Int) extends Iterator[T]{

  val parquetIterator = getPartitionIterator
  var _currentParquetIterator = None : Option[Iterator[T]]

  def toStreamFiles = parquetIterator

  def toStreamSource = Source.fromIterator(()=> this)

  override def hasNext: Boolean = {

    _currentParquetIterator match {

      case Some(iter) =>
        /* there is current parquet iterator */

        iter.hasNext match {

          case true =>
            /* current iterator still has rows to process */
            true

          case false =>
            /* current iterator comes to end, try next iterator */
            _currentParquetIterator = _nextParquetIterator
            _currentParquetIterator match {
              case Some(nextIter) => nextIter.hasNext
              case None => false
            }
        }

      case None =>
        /* no current iterator */
        _currentParquetIterator = _nextParquetIterator
        _currentParquetIterator match {
          case Some(nextIter) => nextIter.hasNext
          case None => false
        }
    }
  }

  override def next(): T = {

    _currentParquetIterator match {
      case Some(iter) => iter.next()
      case None => null.asInstanceOf[T]
    }
  }

  private def getPartitionIterator: Iterator[String] = {

    val parquetFiles  = HdfsHelper.listParquetFiles(parquetRootPath) map { f =>
      val partitionNum = math.abs(f.hashCode) % partitions
      (f, partitionNum)
    }

    val targetFiles = parquetFiles filter (_._2 equals targetPartition)

    targetFiles.map(_._1).toIterator
  }

  private def _nextParquetIterator: Option[Iterator[T]] ={

    parquetIterator.hasNext match {

      case true =>
        /* take next parquet to process */
        val nextParquetFile = parquetIterator.next()

        val conf = new Configuration()
        conf.set("fs.file.impl", "org.apache.hadoop.fs.LocalFileSystem")
        conf.set("fs.s3a.server-side-encryption-algorithm", "AES256")

        val path = new Path(nextParquetFile)
        val reader = AvroParquetReader.builder[T](path)
          .withConf(conf)
          .build()

        Some(AvroParquetReaderIterator.create(reader))

      case false =>
        /* no parquet files to process */
        None
    }
  }
}
