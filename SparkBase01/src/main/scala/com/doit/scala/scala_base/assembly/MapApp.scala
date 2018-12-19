package com.doit.scala.scala_base.assembly

import scala.collection.mutable


object MapApp {
  /**
    * 集合
    * 03 map
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val map = new mutable.HashMap[Int,String]()
    //加元素
    map += (1 -> "01")
    map += (2 -> "02")
    map += (3 -> "03")

    // 循环
    for((k,v) <- map) println((k,v))
    for((key, _) <- map) println(key + " : " + map.getOrElse(key,"0"))
    for(key <- map.keySet) println(key + " -> " + map.getOrElse(key, "0"))
    for(value <- map.values) print(value + "  ")
    println()

    //减元素
    map.remove(2)
    println(map)


    println(map(1))
    println(map.getOrElse(1,"0"))

  }

}
