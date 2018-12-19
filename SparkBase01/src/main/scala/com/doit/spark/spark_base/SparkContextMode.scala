package com.doit.spark.spark_base

import org.apache.spark.{SparkConf, SparkContext}

object SparkContextMode {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[2]").setAppName(this.getClass.getName)
    val sc = new SparkContext(sparkConf)

    //TODO


    sc.stop()

  }

}
