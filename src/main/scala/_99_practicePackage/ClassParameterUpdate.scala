package _99_practicePackage

object ClassParameterUpdate extends App {

  /*
    Challenge: Define a Class method to append the value stored in Class Parameter with itself.
    Solution: Implement a Class with a Class Parameter "Hello". Define 2 methods within the Class.
               - Method 1: Returns the value stored in Class Parameter
               - Method 2: Create a new Class parameter with "Hello" appended to Class Parameter.
   */

  class SayHello (hello: String = "Hello") {
    def newHello: SayHello = new SayHello(this.hello + "Hello")
    def show: String = hello
  }

  val sayHello1 = new SayHello
  println(sayHello1.show)
  val sayHello2 = sayHello1.newHello
  println(sayHello2.show)
  val sayHello3 = sayHello2.newHello
  println(sayHello3.show)
}
