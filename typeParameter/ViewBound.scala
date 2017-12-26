package typeParameter

object ViewBound extends App {
    case class Student[T, S <% Comparable[S]](var name:T, var age:S)

    val s = Student("John", "178")

    // s2 is legal because Int can automatic converse to RichInt
    // and RichInt implement compareTo
    val s2 = Student("Mike", 178)

    println(s)
    println(s2)
}
