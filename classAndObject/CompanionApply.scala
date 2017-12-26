package classAndObject

object CompanionApply extends App {
    class Student {
        var name: String = "John"
    }

    object Student {
        def apply(): Student = new Student()
    }

    val s = Student()
    println(s.name)
}
