package com.doit.scala.scala1

object AbstractApp {

  /**
    * 1-3. 抽象类
    * 只能被继承，可以定义函数和属性，
    * 使用时，调用的是抽象类的子类，具体方法实现和属性都在其子类中
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("3. 理解抽象类" + "\r\n")

    val student_jyx = new Student2("jyx",22,"soccer")
    student_jyx.hit(student_jyx.favourite)

  }

  abstract class Person2(val name:String, val age:Int){

    def  hit(name:String)
    val address:String

  }

  class Student2(name:String, age:Int, val favourite:String ) extends Person2(name,age){
    println("------------- enter Student2 -------------")

    override def hit(name:String): Unit = {
        println(" let the " + favourite + " hit " + name)
    }

    override val address: String = ""

    println("------------- enter Student2 -------------")
  }


}


