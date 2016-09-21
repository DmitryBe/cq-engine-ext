

name := """scala-toolbox"""

version := "1.0"

scalaVersion := "2.11.7"

val akkaVersion = "2.4.8"
val parquetVersion = "1.6.0"
val hadoopVersion = "2.6.0"
val cqengineVersion = "2.7.0"
val twitterVersion = "6.35.0"

libraryDependencies ++= Seq(

  "org.slf4j" % "slf4j-api" % "1.7.21",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "ch.qos.logback" % "logback-core" % "1.1.3",

  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,

  "org.apache.hadoop" % "hadoop-common" % hadoopVersion,
  "org.apache.hadoop" % "hadoop-client" % hadoopVersion,

  "com.amazonaws" % "aws-java-sdk" % "1.7.5",
  "org.apache.hadoop" % "hadoop-aws" % "2.7.1",

  "com.twitter" % "parquet-avro" % parquetVersion,
  "com.twitter" % "parquet-hadoop" % parquetVersion,

  "com.googlecode.cqengine" % "cqengine" % cqengineVersion,

  "com.twitter" %% "util-eval" % twitterVersion,

  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

fork in run := true

packAutoSettings