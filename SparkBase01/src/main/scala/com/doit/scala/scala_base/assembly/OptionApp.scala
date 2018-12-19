package com.doit.scala.scala_base.assembly

import scala.collection.mutable

object OptionApp {
  /**
    * 集合
    * 04 option
    * Some 和 None 是Option的子类
    * 遇到Some类型的后面加.get 或 .getOrElse获取到具体想要的类型
    * None 没有.get等方法
    *
    * @param args
    */

  def main(args: Array[String]): Unit = {

    val map = new mutable.HashMap[Int, String]()
    map += (1 -> "01020304050607")

    println("1: " + map(1).substring(0, 3) + "     " + map(1).substring(0, 3).getClass.getName)
    println("2: " + map.getOrElse(1, "unknown") + "     " +  map.getOrElse(1, "unknown").getClass.getName)
    println("3: " + map.get(1) + "     " + map.get(1).getClass.getName)
    println("4: " + map.get(1).get + "     " + map.get(1).get.getClass.getName)
    println("5: " + map.get(33) +  "     " + map.get(33).getClass.getName)




  }

}
