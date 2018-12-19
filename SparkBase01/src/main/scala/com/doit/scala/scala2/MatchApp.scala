package com.doit.scala.scala2

import scala.util.Random

object MatchApp {

  def main(args: Array[String]): Unit = {
    val teachers = Array("Aoi Sola", "YuiHatanl", "Akiho Yoshozawa", "-")
    val teacher = teachers(Random.nextInt(teachers.length))

    teacher match{
      case "YuiHatanl" => println("Hi, 波多xx")
      case "Akiho Yoshozawa" => println("Hi, 吉泽xx")
      case "Aoi Sola" => println("Hi, 仓xx")
      case _ => println("看不懂，换其他数组来执行")
    }

  }

}
