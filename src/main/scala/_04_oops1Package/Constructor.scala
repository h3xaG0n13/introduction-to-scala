package _04_oops1Package

object Constructor extends App {

  /*
    Constructor: A Constructor is a special method of a Class.
                 It is automatically invoked when a Class is instantiated.
                 The parameters within a Constructor are known as Class parameters.

    Class Parameter scope:
      - Class parameters are private by default
      - Only values/variables in a Class parameter are public

    Note:
      - Scala Instances are not identical even if parameters are same
   */

  // Class with Constructor & Class parameters
  class Person (val name: String, age: Int) {
    def introduce: String = s"Hi, I am ${name} and I am ${age} years old!"
  }

  // Instance of Class with Class parameter
  val John = new Person("John", 30)
  println(John.introduce)

  // Class Parameter scope
  // Uncomment line to check error
  println(John.name)
  // println(John.age)

  // Instances are not identical even if the Parameters are same
  val John1 = new Person("John", 28)
  val John2 = new Person("John", 28)
  println(John1 == John2)
}
