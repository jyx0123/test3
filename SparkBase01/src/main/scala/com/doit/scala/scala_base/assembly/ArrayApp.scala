package com.doit.scala.scala_base.assembly

import scala.collection.mutable.ArrayBuffer

object ArrayApp {

  /**
    * 集合
    * 01. Array
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    //定长数组
    val array = new Array[String](5)
    println(array.mkString(","))
    println()

    // 调用Array的apply方法定义
    val array2 = Array("jyx", "zhang3", "li4")
    val arrayRes1: String = array2.mkString(",")
    println(arrayRes1)
    println()


    // 不定长数组
    val arrayBuffer = new ArrayBuffer[String]
    println(arrayBuffer)
    println()


    println("arrayBuffer的6种方式添加元素")
    arrayBuffer.append("1")
    arrayBuffer.append("2")
    arrayBuffer.append("3")
    println("+1: " + arrayBuffer)

    arrayBuffer += ("4", "5", "6")
    println("+2: " +arrayBuffer)

    arrayBuffer ++= array2
    println("+3: " + arrayBuffer)

    arrayBuffer.insert(0,"0")
    println("+4: " + arrayBuffer)

    arrayBuffer.insertAll(5,Array("22","23"))
    println("+5: " + arrayBuffer)

    arrayBuffer.prepend("a")
    println("+6: " + arrayBuffer)
    println()
    println()


    println("4种方式删除元素")
    arrayBuffer.remove(0)
    println("-1: " + arrayBuffer)

    arrayBuffer.remove(4,2)
    println("-2: " + arrayBuffer)

    arrayBuffer.trimEnd(1)
    println("-3: " + arrayBuffer)

    arrayBuffer.trimStart(2)
    println("-4: " + arrayBuffer)
    println()
    println()


    println("原数组 - 已有元素-> 新数组")
    val newArrayBuffer1: ArrayBuffer[String] = arrayBuffer.-("1")
    println(newArrayBuffer1)
    println()

    println("原数组 + 字符串 -> 新数组")
    val newArrayBuffer2: String = arrayBuffer.+("_10")
    println(newArrayBuffer2)
    println()






  }
}