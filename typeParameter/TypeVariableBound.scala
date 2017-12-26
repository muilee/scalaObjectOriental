package typeParameter

object TypeVariableBound extends App {
    case class Person(var name:String, var age:Int) extends Comparable[Person]{
        override def compareTo(o: Person): Int = {
            if (this.age > o.age) 1
            else if (this.age == o.age) 0
            else -1
        }
    }

    class TypeVariableBound {
        def compare[T <: Comparable[T]](first:T, second:T) = {
            if(first.compareTo(second) > 0) first
            else second
        }
    }

    val tvb = new TypeVariableBound
    println(tvb.compare("A", "B"))
    println(tvb.compare(Person("Stephen", 19), Person("John", 20)))
}
