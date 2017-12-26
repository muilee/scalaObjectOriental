package typeParameter

object ContextBound extends App {

    case class Person(val name: String){
        println("constructing " + name)
    }
    class PersonOrdering extends Ordering[Person]{
        override def compare(x: Person, y: Person): Int = {
            if(x.name > y.name) 1
            else if(x.name == y.name) 0
            else -1
        }
    }

    // [T:Ordering] mean that there must be a implicit value or implicit object in this environment
    class Pair[T:Ordering](val first:T, val second:T){
        def smaller(implicit ord:Ordering[T]) = {
            if(ord.compare(first, second) > 0) second
            else first
        }
    }

    // this is the implicit value
    implicit val p1 = new PersonOrdering

    val p = new Pair(Person("John"), Person("Mike"))
    println(p.smaller)
}
