package patternMaching

object ConstructorModeUnapply extends App {

    class Dog(val name:String, val age:Int)

    object Dog{
        def unapply(dog: Dog): Option[(String, Int)] = {
            if (dog != null) Some(dog.name, dog.age)
            else None
        }
    }

    val dog = new Dog("Pet", 2)
    def pattern(x: AnyRef) = x match {
        case Dog(name, age) => println(s"Dog name = $name, age = $age")
        case _ =>
    }

    pattern(dog)
}
