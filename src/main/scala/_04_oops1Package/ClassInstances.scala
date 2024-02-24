package _04_oops1Package

object ClassInstances extends App {

  /*
    Class: A Class is a template that can be instantiated for specific use cases.
           Instantiation is the process of creating instances of the Class.
           Instance is in actual memory conforming to the data structure of the Class.
   */

  // Defining a Class with a method (function)
  class Person {
    def introduction = "Hi, there"
  }

  // Creating an Instance of Class
  // Calling method of Class from Instance created
  val person = new Person
  println(person.introduction)

}