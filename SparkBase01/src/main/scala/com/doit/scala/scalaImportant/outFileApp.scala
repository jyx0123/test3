package com.doit.scala.scalaImportant

import java.lang.StringBuffer

import scala.collection.mutable.ArrayBuffer


object outFileApp {
  def main(args: Array[String]): Unit = {

    val line1="http//ruozedata.com/basic.html         [2018-12-08 22:00:00]       3"
    val line2="http//ruozedata.com/advanced.html      [2018-12-08 23:00:00]       4"
    val buffer = ArrayBuffer[String]()
    buffer.append(line1)
    buffer.append(line2)

    fileWriting("intoFile.txt",buffer)
    //File("intoFile.txdd`t").writeAll(line1)
    //File("intoFile.txt").writeAll(line2)
  }

  def fileWriting(path: String,buffer: ArrayBuffer[String]) {
    import java.io.{File, BufferedWriter, FileWriter}
    val pw = new BufferedWriter(new FileWriter(new File(path)))
    buffer.foreach { x =>
      pw.append(s"data: $x").write("\n")
    }
    pw.flush
    pw.close
  }

}
