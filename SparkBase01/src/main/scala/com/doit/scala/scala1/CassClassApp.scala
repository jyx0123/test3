package com.doit.scala.scala1

object CassClassApp {

  /**
    * 1-5. class class
    * 作为class的补充， 在case class中的参数不需要val 修饰， 类本身也不需要new
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println(Dog())
    println(Dog().name)
  }
}

case class Dog(name:String = "旺财")