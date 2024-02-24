package _03_functionalProgramming1Package

object FunctionsIntroduction extends App {

  /*
  Function: Re-usable Modular code that can accept parameters to produce a value.
    - Function Definition needs Parameters within Parenthesis & A return type.
    - Parameters defined need to have a return type defined in the Function definition.
    - Neither Parameters or Parenthesis are mandatory for Function definition.
    = The only thing necessary here is the Actual Function Call is identical to the Function definition.
    - Return Type is also optional as Compiler can evaluate the last expression and derive the Return type.
   */

  // Function Definition with Parameters and Return Type
  def aFunction(aString: String, aInt: Int): String = {
    aString + " " + aInt
  }
  println(aFunction("hello", 10))

  // Function Definition without Parameters and Return Type
  def bFunction() = 10
  println(bFunction())

  // Function Definition without parenthesis
  // Return type is inferred by compiler after evaluating definition
  def cFunction = "Start" + " " + 20
  println(cFunction)

}
