package _14_patternMatchingPackage

object SwitchCase extends App {

  /*
    Switch Case:
      - Allows configuration of values based on specific input
   */

  def charBasedWord(char: Char): String = {
    char.toUpper match {
      case 'A' => "Apple"
      case 'B' => "Ball"
      case 'C' => "Cat"
      case _ => "no word"
    }
  }

  println(charBasedWord('b'))
  println(charBasedWord('z'))

}
