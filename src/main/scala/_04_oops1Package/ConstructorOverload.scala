package _04_oops1Package

object ConstructorOverload extends App {

  /*
  Constructor Overload:
      - A Constructor can be overloaded similar to a Class attribute.
      - In practice, this might be necessary if Class parameter are not known.
      - Better practice is to use Default Parameter in Constructor
   */

  // Constructor Overload with default value
  class Clock(time: String){
    def this() = this("00:00:00")
    def show: String = time
  }

  // Class Instantiated without Class parameter
  // Overloaded Constructor supplies default value
  val midnight = new Clock
  println(midnight.show)


  // Instead of Overloading Constructor
  // Better practice is to use Default Class Parameter
  class BetterClock(time: String = "00:00:00"){
    def show: String = time
  }

  // Instance of Class has same behaviour
  val middleOfNight = new BetterClock
  println(middleOfNight.show)

}
