package _05_oops2Package

object PrivateProtectedPublic extends App {

  /*
    Private: A class member assigned as Private can only be accessed within the Class
    Protected: A class member assigned as Private can be accessed from within the Class or any Child Class inheriting it.
    Public: A class member assigned as Public can be accessed from anywhere within and outside the Class.
   */

  // Class definition with Public, Protected and Private Class Attribute in Constructor
  class Person (val name: String, private val age: Int) {
    protected val gender: Char = 'M'
    private val bloodGroup: String = "O+"
  }

  // Instance of Class with Public, Protected and Private Class Attributes defined
  val John = new Person("John", 30)

  // Accessing the Public Class Attribute
  println(John.name)

  // Protected and Private Class attributes can not be accessed outside the Class
  // Uncomment the lines to see the error message
  //println(John.age)
  //println(John.gender)

  // Child Class inheriting Previously defined Class
  // Protected Parent Class attribute is referenced in Child Class
  // Parent Class Private Attribute can not be referenced by Child Class
  // Uncomment line to see error message
  class Child(name: String, age: Int) extends Person(name, age) {
    def parentGender: Char = gender
    //def parentBloodGroup: String = bloodGroup
  }

  // Instance of Child Class
  val James = new Child("James", 18)
  // Child Class Method to reference Parent's Protected Class Attribute
  println(James.parentGender)

}

