package classAndObject

object Private extends App {
    class Person{

        // if yor modify private to private[this], you can not access from companion object (object Person)
        private var name: String = _
        def this(name:String){
            this()
            this.name = name
        }

    }

    object Person{
        def printName = println(new Person("John").name)
        def x = {
            val p = new Person("John")
            p.name = "Jack"
            println(p.name)
        }
    }

    println(Person.printName)
    println(Person.x)
}
