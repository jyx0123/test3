package com.doit.scala.scala2

import java.net.{URI, URL}

import scala.io.Source

object FileApp {

  def main(args: Array[String]): Unit = {

    val source = Source.fromFile("D:\\codesData\\myDataTest\\201807\\firstTest.txt")
    for(line <-source.getLines()){
      println(line)
    }

    val source2 = Source.fromURL(new URL("http://www.baidu.com"))
    for(line <- source2.getLines()){
      println(line)
    }

  }

}
