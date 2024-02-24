package _02_fundamentalsPackage

object CodeBlock extends App {

  /*
    CodeBlock: A CodeBlock is similar to an Expression.
               It is used to segregate a set of definitions and expressions.
               The value assigned to a CodeBlock is the value of last expression.
   */


  // Below CodeBlock has multiple definitions
  // Evaluated value of the last expression is assigned to CodeBlock
  // If-else block evaluates to true but the last expression is 3

  val aCodeBlock = {
    val aInt = 1
    val bInt = 2
    if (aInt + bInt > 2) true else false
    3
  }
  println(aCodeBlock)

}
