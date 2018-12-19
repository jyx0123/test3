package com.doit.scala.scala_base.assembly

import scala.collection.mutable.ListBuffer

object ListApp {

  /**
    * 集合
    * 02List
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    println(Nil)

    val list = List[String]("1","2","3")
    println(list)
    println()

    val listBuffer = ListBuffer[String]("1","2","3")
    println(listBuffer)
    println()

    println("加元素共6种方式")
    listBuffer.append("4","5")
    println("(1). " + listBuffer)

    listBuffer += ("6")
    println("(2). " + listBuffer)

    listBuffer.insert(2,"a","b")
    println("(3). " + listBuffer)

    listBuffer ++= Array("01","02","03")
    println("(4). " + listBuffer)

    listBuffer ++= List("001","002","003")
    println("(5). " + listBuffer)

    listBuffer.prepend("123")
    println("(6). " + listBuffer)
    println()
    println()

    // listBuffer减元素，这里与arrayList基本相同，略

    println("原数组 - 已有元素-> 新数组")
    val buffer: ListBuffer[String] = listBuffer.-("1")
    println(buffer)
    println()

    println("原数组 + 字符串 -> 新数组")
    val str = listBuffer.+("c")
    println(str)
    println()

    println("获取指定下标的元素")
    println(listBuffer.apply(0))

  }

}
