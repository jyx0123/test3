package com.doit.scala.scala2

import java.io.File

import ImplicitTool._

object ImplicitApp {

  def main(args: Array[String]): Unit = {
    println("隐式转换 *** ")

    val man_jj = new Man("JJ")
    println(man_jj.fly)

    val file = new File("D:\\codesData\\myDataTest\\201807\\firstTest.txt")
    println(file.read)

  }
}



