package _99_practicePackage

object HigherOrderFunctionLoop extends App {

  /*
    Challenge: Using higher-order function implement a Function that takes a Function as parameter and evaluates it for n times.
               n is a separate parameter passed.
   */

  def loopEvaluator(function: (Int => Int), iterator: Int, valueToBeUsed: Int): Int = {
    if (iterator == 0) valueToBeUsed
    else loopEvaluator(function, iterator - 1, function(valueToBeUsed))
  }
  def square(num: Int): Int = num * num

  println(loopEvaluator(square, 2, 3))


}
