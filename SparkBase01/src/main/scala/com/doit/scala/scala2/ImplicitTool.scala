package com.doit.scala.scala2

import java.io.File

import scala.io.Source

object ImplicitTool {

  implicit def file2RichFile(file: File) = new RichFile(file)
  implicit def SuperMan(man: Man) = new SuperMan(man)


  /**
    * 隐式方法
    */
  class RichFile(val file: File) {
    def read = Source.fromFile(file.getPath).mkString
  }


  class SuperMan(val man:Man){
    def fly = man  +" 飞起来了！ "
  }



}
