package com.doit.scala.scala2

object ADFuncationApp {


  def main(args: Array[String]): Unit = {
    println("高阶函数*****" + "\r\n")

    // 例1：遍历List
    val l = List(1,2,3,4,5,6,7,8)

    // 不建议的写法
/*    for(ele <- l){
      println(ele * 2)
    }*/

    // 推荐
    //map: 映射
    println(l.map(_*2))

    //了解其他写法
    l.map((x:Int) => x*2)
    l.map(x => x*2)


    // 过滤
    println(l.map(_*2).filter(_>8))

    // 取前n个
    println(l.take(3))

    // reduce  求和
    println(l.reduce(_ + _))


    // curry
    println(l.fold(1)(_+_))


    // flatMap







  }


}
