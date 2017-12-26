package classAndObject

object InnerClass extends App {

    class Student(var name: String, var age:Int){
        class Grade(var name:String)

        object Utils1{
            def print(name:String) = println(name)
        }
    }

    object Student{
        class Printer{
            def print(name:String) = println(name)
        }

        object Utils2{
            def print(name:String) = println(name)
        }
    }

    val student = new Student("John", 18)
    println(new student.Grade("freshman").name)

    student.Utils1.print("GOOD")

    val printer = new Student.Printer()
    printer.print("GOOOOOOD")

    Student.Utils2.print("DDDDDDD")
}
