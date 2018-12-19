package com.doit.scala.scala1


object ConstructorAPP {

  /**
    * 1-2. 构造器
    * 主构造器，附属构造器
    * 类的继承继承，方法重写
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("2. 理解构造器" + "\r\n")

    println("new 就是调用的构造器")
    val person = new Person("jyx",22)
    println(person.name + "," + person.age + "," + person.school)

    println()
    println("(1). 使用附属构造器")
    val person_jj = new Person("jj", 22,"man")
    println(person_jj.name + "," + person_jj.age + "," + person_jj.gender)

    println()
    println("(2). 使用继承")
    val enginner_ii = new Enginner("ii",25,"machine")
    println(enginner_ii)
    println("(3). 重写参考Enginner中的 toString方法 和 school 属性")

  }

  //主构造器
  class Person(val name:String, val age:Int){
    println("------------- enter Person -------------")

    //附属构造器 def this
    //   第一行必须调用自己的主构造器，或其他附属构造器
    //   第二行的this指主构造器
    def this(name: String,age: Int, gender:String){
      this(name,age)
      this.gender = gender
    }

    val school = "dream"
    var gender = ""

    println("------------- leave Person -------------")
  }


  class Enginner(name:String, age:Int, var major:String) extends Person(name, age){

    println("------------- enter Enginner -------------")

    println("I am major is " + major)


    override val school: String = "北京大学"

    override
    def toString: String = {
      "Enginner[ name= " + name + "  age= " + age + "  school = " + school + "  semajorx=" + major + " ]"
    }

    println("------------- leave Enginner -------------")

  }


}
