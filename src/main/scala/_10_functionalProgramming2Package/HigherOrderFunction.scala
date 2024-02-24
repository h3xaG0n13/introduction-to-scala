package _10_functionalProgramming2Package

object HigherOrderFunction extends App {

  /*
    Higher Order Function:
      - A Function that accepts another Function as a parameter or returns a Function is known as Higher Order Function
   */

  trait InnerAdderFunction[A1, B1]{
    def apply(num2: A1): B1
  }
  trait OuterAdderFunction[A2, B2]{
    def apply(num1: A2): B2
  }

  val outerFunction = new OuterAdderFunction[Int, InnerAdderFunction[Int, Int]] {
    override def apply(num1: Int): InnerAdderFunction[Int, Int] = new InnerAdderFunction[Int, Int] {
      override def apply(num2: Int): Int = num1 + num2
    }
  }
  // outerFunction Function(Instance of OuterAdderFunction) method Apply when passed with 1 parameter
  // returns an instance of InnerAdderFunction
  println(outerFunction(2))

  // In order to pass the parameter to Instance of InnerAdderFunction method Apply
  // Create a variable of type InnerAdderFunction and assign the value returned from
  // instance of OuterAdderFunction method Apply
  val innerFunction: InnerAdderFunction[Int, Int] = outerFunction(2)
  // Instance of InnerAdderFunction method Apply accepts a parameter
  // This parameter will be used with the previously passed parameter in Apply method of Instance of OuterAdderFunction
  println(innerFunction(3))

}
