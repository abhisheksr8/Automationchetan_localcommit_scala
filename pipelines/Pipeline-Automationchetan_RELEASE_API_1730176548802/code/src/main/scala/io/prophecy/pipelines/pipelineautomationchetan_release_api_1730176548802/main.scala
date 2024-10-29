package io.prophecy.pipelines.pipelineautomationchetan_release_api_1730176548802

import io.prophecy.libs._
import io.prophecy.pipelines.pipelineautomationchetan_release_api_1730176548802.config._
import io.prophecy.pipelines.pipelineautomationchetan_release_api_1730176548802.functions.UDFs._
import io.prophecy.pipelines.pipelineautomationchetan_release_api_1730176548802.functions.PipelineInitCode._
import io.prophecy.pipelines.pipelineautomationchetan_release_api_1730176548802.graph._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Main {

  def apply(context: Context): Unit = {
    val df_Project_Automationchetan_scala_RELEASE_API_1730176548802_dataSet =
      Project_Automationchetan_scala_RELEASE_API_1730176548802_dataSet(context)
    val df_customer_details_selection = customer_details_selection(
      context,
      df_Project_Automationchetan_scala_RELEASE_API_1730176548802_dataSet
    )
  }

  def main(args: Array[String]): Unit = {
    val config = ConfigurationFactoryImpl.getConfig(args)
    val spark: SparkSession = SparkSession
      .builder()
      .appName("Pipeline-Automationchetan_RELEASE_API_1730176548802")
      .config("spark.default.parallelism",             "4")
      .config("spark.sql.legacy.allowUntypedScalaUDF", "true")
      .enableHiveSupport()
      .getOrCreate()
    val context = Context(spark, config)
    spark.conf.set(
      "prophecy.metadata.pipeline.uri",
      "pipelines/Pipeline-Automationchetan_RELEASE_API_1730176548802"
    )
    registerUDFs(spark)
    MetricsCollector.instrument(
      spark,
      "pipelines/Pipeline-Automationchetan_RELEASE_API_1730176548802"
    ) {
      apply(context)
    }
  }

}