package com.doit.scala.scala1

object SimpleAPP {

  /**
    * 1-1. 面向对象
    * 使用对象编程
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("1. 理解面向对象" + "\r\n")

    val people = new People
    people.name = "jyx"
    people.age = 28;
    people.sex = "man"
    println(people)
    println(people.code())
    println(people.sing())
  }

  /**
    * 定义一个bean，class 定义的类使用时一定要 new
    */
  class People {
    /**
      * 使用_时前面必须加数据类型
      * 前面使用 private[this] 修饰，只能在类内部使用，外面不能调用
      */
    var name: String = _;
    var age = 29;
    var sex = "";

    def code() = {
      name + "状态: " + "coding"
    }

    def sing() = {
      name + "正在唱歌"
    }

    override
    def toString: String = {
      "People[ name= " + name + "  age= " + age + "  sex=" + sex + " ]"
    }
  }

}
