package _08_oops5Package

object CustomException extends App {

  /*
    Custom Exception:
      - Scala allows creating custom exception by inheriting Exception Class
   */

  // Custom Exception Class inheriting from Exception Parent Class
  class myException extends Exception {
    println("There is an Exception")
  }

  // Instantiating Custom Exception Class
  val newException = new myException
  // Throwing Customer Exception
  throw newException

}
