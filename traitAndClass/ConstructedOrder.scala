package traitAndClass

object ConstructedOrder extends App {
    trait Logger{
        println("Logger")
    }

    trait FileLogger extends Logger{
        println("FileLogger")
    }

    trait Closable{
        println("Closable")
    }

    class Person{
        println("Constructing Person.....")
    }

    class Student extends Person with FileLogger with Closable{
        println("Constructing Student.....")
    }

    new Student
}
