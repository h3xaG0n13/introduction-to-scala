package _04_oops1Package

object AttributeOverload extends App {

  /*
    Overload : A Class parameter exists within the scope of the Class body.
               Overload allows more than one Class parameter with same name in Class body.

    Note:
      - To access a Class parameter within a Class body, this keyword is used.
      - At any given point, a Class Parameter is immutable.
   */


  // Class Parameter overload in Class method
  // Class Parameter is immutable and can not be reassigned
  // Remove comment to see error message
  class Person (name: String) {
    def greetings(name: String): String = {
      s"Hi ${name}, I am ${this.name}"
      // this.name = name
    }
  }

  // Instance of Class with overloaded class parameter
  // Both Class Parameter values referred in Method
  val John = new Person("John")
  println(John.greetings("Suzy"))

}
