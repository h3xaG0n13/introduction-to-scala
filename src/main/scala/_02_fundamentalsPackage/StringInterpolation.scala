package _02_fundamentalsPackage

object StringInterpolation extends App {

  /*
  String Interpolation:
    - String is immutable data type.
    - String once assigned a value can not be manipulated.
    - String Interpolation allows assigning variables.
   */

  val aName = "Summer"
  val aAge = 30

  // Passing variables in a String
  val newString1 = s"Hello, my name is ${aName} and I am ${aAge} years old"
  println(newString1)

  // Expressions can be passed in a String
  val newString2 = s"Next year I will be ${aAge + 1} years old"
  println(newString2)

  // Usage of Raw String to ignore escape sequence
  val newString3 = raw"Hello, /n World"
  println(newString3)

}
