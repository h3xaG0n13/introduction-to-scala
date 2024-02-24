package _08_oops5Package

object ExceptionHandling extends App {

  /*
    Exception Handling:
      - For a String variable defined as null, if we attempt to find the length of the string using the string method length
        it is unable to find the length of the null object and hence throws a NullPointerException.
      - Scala allows users to assign an exception to a value and the type inferred by the compiler is Nothing.
   */

  // Defining String with Null value
  val x: String = null

  // Checking length of String with NULL will throw NullPointerException
  // Uncomment below line and run to see the error message
  //println(x.length)

  // Raise Null Pointer Exception manually
  // Uncomment below line and run to see the error message
  //val nullPointerException = throw new NullPointerException()

  // Try-Catch-Finally block for Exception handling
  // Finally block does not influence the return type of this expression
  try {
    val x: String = null
    println(x.length)
  } catch {
    case e: NullPointerException => println("Null Pointer Exception")
  } finally {
    println("End")
  }

}
