package _03_functionalProgramming1Package

object FunctionArgumentCallTypes extends App {

  /*
  Arguments in a Function can be referenced in 2 different ways.
  During Function Definition, an argument can defined as:
    - Called by Value: All references to the Argument are evaluated at the same time.
                       Hence, the value remains the same throughout the lifecycle.
    - Called by Name: Argument is evaluated only when it is called.
                      Hence, the value can change each time it is referenced.
                      It is useful if there are possible failure points.
   */

  // Argument is called by its value
  // Both instances of time will have same value
  def callByValue(time: Long): Unit = {
    println(time)
    println(time)
  }
  println("Argument is called by value. Values are same:")
  callByValue(System.nanoTime())


  // Argument is called by its name
  // Each reference will have a different value
  def callByName(time: => Long): Unit = {
    println(time)
    println(time)
  }
  println("Argument is called by name. Values are different:")
  callByName(System.nanoTime())

}
