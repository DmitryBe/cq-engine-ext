package io.toolbox.parquet

import akka.stream.scaladsl.Source
import io.toolbox.hdfs.HdfsHelper
import org.apache.avro.generic.IndexedRecord
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import parquet.avro.AvroParquetReader

class AvroParquetPartitionsIterator[T <: IndexedRecord](parquetRootPath: String, partitions: Int, targetPartition: Int)
                                                       (implicit hadoopConf: Configuration) extends Iterator[T]{

  private val _parquetIterator = getPartitionIterator
  private var _currentParquetIterator = None : Option[Iterator[T]]

  def toStreamFiles = _parquetIterator

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
            _currentParquetIterator = nextParquetIterator
            _currentParquetIterator match {
              case Some(nextIter) => nextIter.hasNext
              case None => false
            }
        }

      case None =>
        /* no current iterator */
        _currentParquetIterator = nextParquetIterator
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

  private def nextParquetIterator: Option[Iterator[T]] ={

    _parquetIterator.hasNext match {

      case true =>
        /* take next parquet to process */
        val nextParquetFile = _parquetIterator.next()

        val path = new Path(nextParquetFile)
        val reader = AvroParquetReader.builder[T](path)
          .withConf(hadoopConf)
          .build()

        Some(AvroParquetReaderIterator.createFromParquetReader(reader))

      case false =>
        /* no parquet files to process */
        None
    }
  }

  private def getPartitionIterator: Iterator[String] = getPartitionFiles(parquetRootPath, targetPartition, partitions).toIterator

  private def getPartitionFiles(parquetRootPath: String, targetPartitionId: Int, dataNodesTotal: Int): Seq[String] ={
    val parquetPartitionsFiles = HdfsHelper.listParquetFiles(parquetRootPath)
    val parquetPartitionsTotal = parquetPartitionsFiles.length
    val parquetPartitionsPerDataNode = parquetPartitionsTotal % dataNodesTotal match {
      case 0 => parquetPartitionsTotal / dataNodesTotal
      case _ => parquetPartitionsTotal / dataNodesTotal + 1
    }
    val offset = targetPartitionId * parquetPartitionsPerDataNode
    parquetPartitionsFiles.drop(offset).take(parquetPartitionsPerDataNode)
  }

}
