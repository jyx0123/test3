package com.doit.scala.scala1

/**
  * 1-4. 互为伴生
  * object修饰的 ApplyTest 是 class修饰的 ApplyTest 的伴生对象
  * class修饰的 ApplyTest  是 object修饰的 ApplyTest 的伴生类
  *
  * object中的apply方法执行： obejct构造器 -> object apply()  -> class构造器
  * class中的apply方法执行：class构造器 -> class apply()
  * 两个地方的apply()可以一起执行，要注意class构造器会执行2次
  *
  */

class ApplyTest {
  println("------------- enter class ApplyTest -------------")

  def apply() = {
    println("-~~~~~~~~ enter class-apply method ~~~~~~~~~-")
    println("-~~~~~~~~ leave class-apply method ~~~~~~~~~-")
  }

  println("------------- leave class ApplyTest -------------")

}


object ApplyTest {
  println("------------- enter object ApplyTest -------------")

  var count = 0

  def incr() = {
    count += 1
    count
  }

  def static(): Unit = {
    println("-~~~~~~~~ enter static method ~~~~~~~~~-")
  }


  def apply(): ApplyTest = {
    println("-~~~~~~~~ enter object-apply method ~~~~~~~~~-")

    println("-~~~~~~~~ leave object-apply method ~~~~~~~~~-")
    new ApplyTest()
  }


  incr
  println("------------- leave object ApplyTest -------------")
}


object ApplyApp {

  def main(args: Array[String]): Unit = {
    // 执行object 中的incr方法
    println(ApplyTest.incr)
    println()
    println()

    // new 的一定是class, object 是静态的
    val applyTest = new ApplyTest
    println(applyTest.getClass.getName)
    println()
    println()

    // 执行object中的apply()方法
    var applyTest2 = ApplyTest()
    applyTest2
    println()
    println()

    // 执行class中的apply()方法
    val c = new ApplyTest
    c()

  }
}