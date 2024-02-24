package _07_oops4Package

object CaseClass extends App {

  /*
    Case Class:
      - Case Classes are used to remove boiler plate code for simple Class definitions.

    Note:
      - A Case Class parameter is Public by default compared to Private for regular Classes
      - Two instances of a Case Class are the same compared to different for regular Classes
      - Case Objects can also be created. Objects don't have a Constructor.
   */

  // Create Case Class
  case class Person(name: String, age: Int)

  // Instantiating Case Class
  val John1 = new Person("John", 30)
  val John2 = new Person("John", 30)
  // Both Instances are the same
  println(John1 == John2)

  // Copy allows duplication of Case Class Instances
  val John3 = John2.copy()
  println(John1 == John3)

  // Create Case Object
  case object CaseObject
}
