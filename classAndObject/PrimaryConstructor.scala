package classAndObject

object PrimaryConstructor extends App {

    // if you want to modify constructor to private, add private keyword after Person like class Person private(...)
    class Person(val name:String="", val age:Int=18){
        println("constructing Person")

        override def toString() = name + ":" + age
    }

    val p = new Person("John", 20)
    println(p)
    val p1 = new Person()
    println(p1)
    val p2 = new Person("Nill")
    println(p2)
}