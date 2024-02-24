package _11_functionalProgramming3Package

object Sequences extends App {

  /*
    Sequences:
      - A type of collection that can be traversed in a specific order.
   */

  val seq1 = Seq(1, 2, 3, 4)

  // Sequence Methods
  println(s"Sort the sequence: ${seq1.sorted}")
  println(s"Reversing a Sequence: ${seq1.reverse}")
  println(s"Element in Position 2: ${seq1(2)}")
  println(s"Concatenation of 2 sequences: ${seq1 ++ Seq(5, 6, 7)}")

  // Generator
  val seq2: Seq[Int] = 1 to 4
  println(seq1 == seq2)

  // Iteration of the elements in a Sequence
  seq2.foreach(x => println(x))

}
