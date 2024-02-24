package _05_oops2Package

object Polymorphism extends App {

  /*
    Polymorphism:
      - Ability to have an inherited Class member with different behave differently
      - Also known as Overload.
   */

  // Parent Class with attributes and methods
  class Parent(name: String, age: Int) {
    protected val gender: Char = 'M'
    def getGender: String = gender.toString
    def greetings: String = s"Hi, I am ${name} and I am ${age}${gender}"
  }

  // Child Class with Attribute and Method overload
  class Child(name: String, age: Int) extends Parent(name, age) {
    override val gender: Char = 'F'
    override def greetings: String = s"Hi, I am ${name} and I am a ${gender} of age ${age}"
  }

  // Instantiating the Parent and Child Classes
  val John = new Parent("John", 30)
  val Sherry = new Child("Sherry", 12)

  // Instance Attribute Check
  println(John.getGender)
  println(Sherry.getGender)

  // Instance Method Check
  println(John.greetings)
  println(Sherry.greetings)
}
