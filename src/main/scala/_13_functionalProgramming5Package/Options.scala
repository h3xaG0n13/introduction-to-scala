package _13_functionalProgramming5Package

object Options extends App {

  /*
    Options:
      - A data type that is used to indicate the possible presence or absence of a value against a variable.
      - This is used in place of Null to avoid conditions for Null value checks thereby allowing smoother flow of code.
   */

  // Declaration
  def nullReturn: String = null
  println(s"Return Null value: ${nullReturn}")
  println(s"Return Some value: ${Some(nullReturn)}")
  println(s"Handle Null value: ${Option(nullReturn)}")

  // Handling Null
  def alsoNullReturn: String = null
  def returnSomeValue: String = "Yes"
  println(Option(alsoNullReturn).getOrElse(Option(returnSomeValue)))

  // Check if value is Null
  def noneReturn: Option[String] = None
  println(noneReturn.isEmpty)


}
