package io.toolbox.parquet

import akka.stream.scaladsl.Source
import io.toolbox.hdfs.HdfsHelper
import org.apache.avro.generic.IndexedRecord
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import parquet.avro.AvroParquetReader

import scala.collection.mutable

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

        val parquetIter = AvroParquetReaderIterator.createFromParquetReader(reader)
        parquetIter.hasNext match {
          case true => Some(parquetIter)
          case false => nextParquetIterator
        }

      case false =>
        /* no parquet files to process */
        None
    }
  }

  private def getPartitionIterator: Iterator[String] = getPartitionFiles(HdfsHelper.listParquetFiles(parquetRootPath), targetPartition, partitions).toIterator

  private def getPartitionFiles(parquetPartitionsFiles: Seq[String], targetPartitionId: Int, dataNodesTotal: Int): Seq[String] ={

    println("* parquet files [all]")
    parquetPartitionsFiles.foreach{ i =>
      println(s"** $i")
    }

    val parquetPartitionsTotal = parquetPartitionsFiles.length
    val bins = mutable.Map.empty[Int, mutable.Buffer[String]]

    0 until parquetPartitionsTotal foreach { i =>
      val currentBinIdx = i % dataNodesTotal
      val bin = bins.getOrElse(currentBinIdx, mutable.Buffer.empty[String])
      val file = parquetPartitionsFiles(i)
      bin.append(file)
      bins.update(currentBinIdx, bin)
    }

    val parquetPartitionsList = bins.getOrElse(targetPartitionId, Seq())

    println(s"* parquet partitions for node id $targetPartitionId")
    parquetPartitionsList.foreach { i =>
      println(s"** $i")
    }

    parquetPartitionsList
  }

}
