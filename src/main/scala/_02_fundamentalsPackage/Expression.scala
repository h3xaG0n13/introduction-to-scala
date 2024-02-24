package _02_fundamentalsPackage

object Expression extends App {

  /*
    Expression: An expression in Scala is a block of code that can be evaluated.
                Once evaluated, an expression should produce a result.
                This is different from a Statement where the a Statement produces a side-effect.

    Note:
      - In Scala, a statement that doesn't evaluate to produce any value will return Unit
      - Any statement that evaluates to Unit is considered a side-effect of the statement
   */

  // Below statement is an example of an Expression
  // The statement evaluates to the value 11 and doesn't produce any side-effects
  val aExpression: Int = 5 + 6

  // Below statement is not an Expression
  // It returns no values but produces a side-effect on STDOUT
  println(aExpression)

  // Below statement evaluates to Unit
  // It will print the value of aExpression to STDOUT
  println(println(aExpression))
}
