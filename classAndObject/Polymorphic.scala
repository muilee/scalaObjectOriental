package classAndObject

object Polymorphic extends App {
    class Person(var name: String, var age: Int){
        def walk(): Unit = println("walk() method in Person")

        def talkTo(p: Person): Unit = println("talkTo() method in Person")
    }

    class Student(name:String, age: Int) extends Person(name, age){
        private var studentNo: Int = 0

        override def walk(): Unit = println("walk() method in Student")

        override def talkTo(p: Person): Unit = {
            println("talkTo() method in Person")
            println(this.name + " is talking to " + p.name)
        }
    }

    class Teacher(name:String, age: Int) extends Person(name, age){
        private var teacherNo: Int = 0

        override def walk(): Unit = println("walk() method in Teacher")

        override def talkTo(p: Person): Unit = {
            println("talkTo() method in Teacher")
            println(this.name + " is talking to " + p.name)
        }
    }

    val p1: Person = new Teacher("Albert", 38)
    val p2: Person = new Student("John", 19)

    p1.walk()
    p1.talkTo(p2)
    println("=====================")
    p2.walk()
    p2.talkTo(p1)
    println("=====================")
    println(p1.getClass)
    println(p2.getClass)
}
