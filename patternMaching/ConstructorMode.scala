package patternMaching

object ConstructorMode extends App {
    case class Dog(val name: String, val age: Int)
    val dog = Dog("Pet", 2)

    def pattern(x: AnyRef) = x match{
        case Dog(name, age) => println(s"Dog name=$name, age=$age")
        case _ =>
    }

    pattern(dog)
}
