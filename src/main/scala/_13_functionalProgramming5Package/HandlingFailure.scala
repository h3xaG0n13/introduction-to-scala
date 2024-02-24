package _13_functionalProgramming5Package

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App {

  /*
    Handling Failure:
      - Challenge with Try-Catch block is multiple Try blocks make code hard to read.
      - Also, multiple operations that might lead to failure can not be chained together.
   */

  // Checking for Runtime Exception after Handing
  def failureMethod: String = throw new RuntimeException("Error")
  val output = Try(failureMethod)
  println(output.isFailure)

  // Handling Failure in Practice
  def correctMethod: Try[String] = Success("Correct")
  def incorrectMethod: Try[String] = Failure(new RuntimeException("Incorrect"))
  println(incorrectMethod.getOrElse(correctMethod))
}
