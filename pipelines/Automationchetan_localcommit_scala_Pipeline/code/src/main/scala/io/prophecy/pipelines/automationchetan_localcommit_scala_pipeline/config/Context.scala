package io.prophecy.pipelines.automationchetan_localcommit_scala_pipeline.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
