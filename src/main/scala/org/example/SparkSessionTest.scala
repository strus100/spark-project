package org.example

import org.apache.spark.sql.SparkSession

import scala.collection.mutable.ListBuffer

object SparkSessionTest {

  def main(args: Array[String]): Unit = {

    System.setProperty("hadoop.home.dir", "C:\\Hadoop")
    System.setProperty("spark.home.dir", "C:\\Spark")
    val spark = SparkSession.builder().master("local")
      .getOrCreate()

    val tab_source = new ListBuffer[(Int, Int, Int)]()
    for (a <- (1 to 500); b <- (1 to 200); c <- (1 to 50))
      tab_source += ((a,b,c))
    val tab_source_list = tab_source.toList
    val rdd = spark.sparkContext.parallelize(tab_source_list)
    println( rdd.count() )
  }

}
