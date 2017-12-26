package automaticConversion

object ImplicitClass extends App {

    // primary constructor must accept exactly one parameter
    implicit class Dog(val name:String){
        def bark = println(s"$name is barking")
    }

    "John".bark
}
