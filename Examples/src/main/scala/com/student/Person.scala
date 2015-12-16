package com.student

case class Person(name:String, middleName: Option[String], lastName: String) {

  override def toString() = s"Name: $name LastName: $lastName"
}
