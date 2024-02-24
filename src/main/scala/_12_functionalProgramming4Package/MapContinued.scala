package _12_functionalProgramming4Package

import scala.collection.immutable.Map

object MapContinued extends App {

  /*
    Map Operator can be used on a Map element
   */

  val map: Map[Int, String] = Map((1, "First"), (2, "Second"))
  val newmap = map.map(
    pair => {
      //(pair._1 * 2, pair._2.toUpperCase())
      pair._1 * 2 -> pair._2.toUpperCase()
    }
  )
  println(newmap)
}
