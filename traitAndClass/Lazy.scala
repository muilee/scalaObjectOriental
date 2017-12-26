package traitAndClass

import java.io.PrintWriter


object Lazy extends App {

    trait Logger{
        def log(msg:String): Unit
    }

    trait FileLogger extends Logger{
        val fileName:String

        lazy val fileOutput = new PrintWriter(fileName)

        def log(msg: String): Unit = {
            fileOutput.println(msg)
            fileOutput.flush()
        }
    }

    class Person
    class Student extends Person with FileLogger{
        val fileName = "file.log"
    }

    val s = new Student
    s.log("#")
    s.log("lazy demo")

}
