package com.doit.scala.scalaImportant

import scala.io.Source

object WcApp {
  def main(args: Array[String]): Unit = {
    println("wc test")
    println()

    val wcFilePath = "I:\\codeGUide\\self\\rz\\scala\\SparkBase01\\src\\main\\scala\\com\\doit\\scala\\scalaImportant\\wc.txt"

    val source = Source.fromFile(wcFilePath,"utf-8")
    val words = source.getLines().toList.mkString(" ")
    println(words)
    val wcResult = words.split(" ").map((_, 1)).groupBy(_._1).map(tuple => (tuple._1, tuple._2.length))
      .toList.sortBy(_._2).reverse
    println(wcResult)

    source.close()
  }
}