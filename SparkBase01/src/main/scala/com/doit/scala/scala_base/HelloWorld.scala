package com.doit.scala.scala_base

object HelloWorld {

  /**
    *  01基础
    * 1. print
    * 2. 类型转换
    * 3. to与until  //结果为Range类型
    * 4. Range
    * 5. 集合遍历： foreach  for
    * 6. 函数： 普通函数，特殊函数(无惨,默认参数，可变长参数， 命令参数了解即可)
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    println("1. print")
    println("print： Hello World！")

    val name = "jyx"
    println(s"hello: $name")

    val aa=
      """
        |欢迎jyx
        |Hello World already start！
      """.stripMargin
    println(aa)
    println()


    println()
    println("2. view type transform")
    var num: Int = 10
    val tranform1: Long = num.toLong
    val tranform2: Long = num.asInstanceOf[Long]
    println("num类型" + num.getClass.getName)
    println("方式1转换后类型：" + tranform1.getClass.getName)
    println("方式1转换后类型：" + tranform2.getClass.getName)
    println()


    println()
    println("3. view to与until ")
    // 1 until 10
    print("until: " + (1 until 10))
    println()  //1 to 10
    print("   to: " + (1 to 10))
    println()  //1.to(10)
    print("其他写法1: " + (1.to(10)))
    println() //1 to (10)
    print("其他写法2: " + (1 to (10)))
    println()
    println()


    println()
    println("4. view range")
    println(Range(1, 10))
    println(Range(1, 10, 1))
    println(Range(1, 10, 2))
    println(Range(1, 10, -1))
    println(Range(10, 1, -1))
    println()


    println()
    println("5. 集合遍历 1) foreach 2)for")
    println("使用 foreach 遍历集合的所有元素:")
    Array("Hadoop", "Spark", "Flink", "Kylin").foreach(x => print(x + " "))
    println()


    println()
    println(" 使用 for 打印 1~10之间的偶数:")
    for (i <- 1 to 10 if (i % 2 == 0)) {
      print(i + "  ")
    }
    println()
    println()


    println()
    println("6. view function")
    println(
      """
        | 1). 函数内容只有一行时,｛｝ 可以省略；
        | 2). 函数返回值可省略不写, idea 自动匹配。 特殊情况需要配置才可识别
      """.stripMargin)
    val func01 = add(5, 8)
    val func02 = add2(5, 8)
    val func03 = add3(5, 8)
    println("一般写法_add结果: " + func01)
    println("省略返回值类型_add2结果: " + func02)
    println("省略｛｝和返回值类型_add3结果: " + func03)

    println()
    println("函数参数为空，执行时可以省略后面的()")
    sayHello

    println()
    println("【1】默认参数：***" + "\r\n" +
      "函数只有一个参数，在函数中参数位置指定值，在执行时，参数可以不写，执行默认参数")
    sayName()

    println()
    println("【2】命名参数：" + "\r\n" +
      "3种写法执行结果相同  --能看懂就行，很少这么用")
    print("1). 参数(100,10)：")
    speed(100, 10)
    print("2). 参数(distance = 100, time = 10)：")
    speed(distance = 100, time = 10)
    print("3). 参数(time = 10,distance = 100)：")
    speed(time = 10, distance = 100)
    println()


    println()
    println("【2】可变长参数： ***")
    print("1). 普通函数: ")
    sum(1,2)
    print("2). 可变长函数1: ")
    sum2(1,2 ,3)
    print("3). 可变长函数2: ")
    sum2(1 to 10: _*)

  }

  /**
    * def 函數
    *
    */
  def add(x: Int, y: Int): Int = {
    x + y
  }

  def add2(x: Int, y: Int) = {
    x + y
  }

  def add3(x: Int, y: Int) = x + y

  def sayHello() = println("hello jyx")

  // 默认参数 ***
  def sayName(name: String = "jyx") = println(name)

  // 命名参数
  def speed(distance: Float, time: Float) = {
    distance/time
    println(distance/time)
  }


  //变长参数 ***
  def sum(a: Int, b: Int) = println(a + b)

  def sum2(a: Int*) = {
    var result = 0
    for (x <- a) {
      result += x
    }
    println(result)
  }

}
