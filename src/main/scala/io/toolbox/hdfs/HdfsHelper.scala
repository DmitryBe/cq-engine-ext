package io.toolbox.hdfs

import java.net.URI

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}

object HdfsHelper {

  /*
    parse hdfs like path hdfs://name:port/path -> (url, path)
   */
  def parseHDFSPath(path: String ): (Option[String], Option[String]) = {

    val pattern1 = "^(:?^hdfs):\\/\\/(.+):(\\d+)(.+)".r
    val pattern2 = "^(:?^hdfs):\\/\\/(.+)(.+)".r
    val pattern3 = "^(\\/:?.+)".r

    var hdfsUrl = None: Option[String]
    var hdfsPath = None: Option[String]

    path match {

      case pattern1(protocol, ip, port, relPath) =>
        // match: hdfs://name:port/path/
        hdfsUrl = Some(s"$protocol://$ip:$port")
        hdfsPath = Some(relPath)

      case pattern2(protocol, ip, relPath) =>
        // match: hdfs://name/path/
        hdfsUrl = Some(s"$protocol://$ip")
        hdfsPath = Some(relPath)

      case pattern3(fullPath) =>
        // match: /path/
        hdfsUrl = None
        hdfsPath = Some(path)

      case _ =>
        throw new Exception(s"cannot parse hdfs path $path")
    }

    (hdfsUrl, hdfsPath)
  }

  def createHDFSFileSystem(path: String): FileSystem ={

    parseHDFSPath(path) match {

      case (Some(hdfsUrl), Some(hdfsPath)) =>

        val conf = new Configuration()
        conf.set("fs.file.impl", "org.apache.hadoop.fs.LocalFileSystem")
        conf.set("fs.s3a.server-side-encryption-algorithm", "AES256")
        FileSystem.get(new URI(hdfsUrl), conf)

      case (None, Some(fullPath)) =>
        val conf = new Configuration()
        FileSystem.get(conf)

      case _ => throw new Exception("unsupported path format")
    }
  }

  def listParquetFiles(path: String): Array[String] ={

    val fs = createHDFSFileSystem(path)

    val fileList = fs.listStatus(new Path(path))

    fileList collect {
      case f if !f.getPath.getName.startsWith("_") => f.getPath.toString
    }
  }
}
