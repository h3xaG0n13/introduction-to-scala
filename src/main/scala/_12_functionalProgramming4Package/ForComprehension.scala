package _12_functionalProgramming4Package

object ForComprehension extends App {

  /*
    For Comprehension:
      - For iteration over multiple lists, in order to ease the readability of code, for-comprehension can be used.
   */

  // Define 2 Lists
  val list1 = List(1, 2, 3, 4)
  val list2 = List("apple", "oranges")

  // Iterative Concatenation
  val newList1 = for {
    string <- list2
    int <- list1
  } yield (int.toString + string)
  println(newList1)

  // Iterative Concatenation with Filter
  val newList2 = for {
    string <- list2
    int <- list1 if int % 2 == 0    // Filter Condition
  } yield (int.toString + string)
  println(newList2)
}
