package _12_functionalProgramming4Package

object MultiListIteration extends App {

  /*
    Iteration over multiple Lists with map/ flatMap operator
   */

  val list1: List[Int] = List(1, 2, 3, 4)
  val list2: List[Char] = List('a', 'b', 'c', 'd')
  val list3: List[String] = List("apple", "ball", "cat", "dog")

  val newList = list3.flatMap{
    string => list2.map {
      char => list1.map {
          int => int.toString + char.toString + string
      }
    }
  }

  println(newList)
}