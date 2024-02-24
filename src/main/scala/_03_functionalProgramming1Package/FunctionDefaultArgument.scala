package _03_functionalProgramming1Package

object FunctionDefaultArgument extends App {

  /*
  Default Argument: Define a default value to an Argument during the Function Definition.
                    Function to utilise this default value if no Argument is passed.
                    Argument passed overwrites the passed value.
   */

  // Default Argument definition
  def aFunction(aInt: Int, bInt: Int = 2): Int = aInt + bInt

  // Default Argument used
  println(aFunction(1))

  // Default Argument not used
  // Good practice is to provide the Default Argument name
  println(aFunction(1, bInt = 3))

}
