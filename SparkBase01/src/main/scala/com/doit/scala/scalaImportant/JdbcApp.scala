package com.doit.scala.scalaImportant

import java.sql.{Connection, DriverManager, PreparedStatement}

import com.doit.scala.scalaImportant.JdbcApp.preparedStmt


object JdbcApp {
  private val url = "jdbc:mysql://hdp01:3306/mysql57_3306?createDatabaseIfNotExist=true&amp;useSSL=false&amp;characterEncoding=utf8"
  private val driver = "com.mysql.jdbc.Driver"
  private val username = "root"
  private val password = "root"
  private var connection: Connection = _
  var preparedStmt: PreparedStatement = _

  def main(args: Array[String]): Unit = {

    insert
    select
    println("========insert compelete===========")

    update
    select
    println("========update compelete===========")

    del
    select
    println("========del compelete===========")
  }

  /**
    * 查询
    *
    */
  def select(): Unit = {

    var sql = "SELECT session_id, ip, end_user_id, city_id FROM page_views where ip=\"192.168.99.23\";"

    try {
      Class.forName(driver)

      println("select start")
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement
      val rs = statement.executeQuery(sql)
      while (rs.next) {
        val sessionId = rs.getString("session_id")
        val ip = rs.getString("ip")
        val endUserId = rs.getString("end_user_id")
        val cityId = rs.getString("city_id")
        println("session_id = %s, ip = %s, end_user_id = %s, city_id = %s".format(sessionId, ip, endUserId, cityId))
      }
    } catch {
      case e => e.getMessage
    } finally {
      connection.close
      println("select out")
    }
  }

  /**
    * 添加
    */
  def insert(): Unit = {

    var sql =
      """
insert into page_views (track_time, url, session_id, referer, ip, end_user_id, city_id)
VALUES (?,?,?,?,?,?,?)
      """.stripMargin

    try {
      Class.forName(driver)

      println("insert start")
      connection = DriverManager.getConnection(url, username, password)

      preparedStmt = connection.prepareStatement(sql)

      preparedStmt.setString(1, "2018-12-15 13:01:32")
      preparedStmt.setString(2, "http://www.baidu.com")
      preparedStmt.setString(3, "123ruozejyx000000100")
      preparedStmt.setString(4, "")
      preparedStmt.setString(5, "192.168.99.23")
      preparedStmt.setString(6, "123974681")
      preparedStmt.setString(7, "38")

      preparedStmt.execute
    } catch {
      case e => e.getMessage
    } finally {
      preparedStmt.close()
      connection.close()
      println("insert out")
    }
  }


  /**
    * 删除
    */
  def del(): Unit = {
    var sql = "DELETE FROM page_views WHERE ip = ?"

    try {
      Class.forName(driver)

      println("delete start")
      connection = DriverManager.getConnection(url, username, password)

      preparedStmt = connection.prepareStatement(sql)

      preparedStmt.setString(1, "192.168.99.23")

      preparedStmt.execute
    } catch {
      case e => e.getMessage
    } finally {
      preparedStmt.close()
      connection.close()
      println("delete out")
    }

  }


  /**
    * 修改
    *
    */
  def update(): Unit = {
    var sql = "UPDATE page_views SET session_id = ? WHERE ip = ?"

    try {
      Class.forName(driver)

      println("update start")
      connection = DriverManager.getConnection(url, username, password)

      preparedStmt = connection.prepareStatement(sql)

      preparedStmt.setString(1, "123ruozejyx000000101")
      preparedStmt.setString(2, "192.168.99.23")

      preparedStmt.execute
    } catch {
      case e => e.getMessage
    } finally {
      preparedStmt.close()
      connection.close()
      println("update out")
    }


  }
}


