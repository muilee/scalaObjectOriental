package patternMaching

import javax.crypto.Mac

object VariableBindingMode extends App {
    case class Dog(val name:String, val age:Int)
    val dog = Dog("Pet", 2)

    def pattern(x: AnyRef) = x match {
        case d@Dog(_,_) => println(d)
        case _ =>
    }

    pattern(dog)

    println("==============")

    val list = List(List(1,2,3,4), List(5,6,7,8,9))
    def pattern1(x: AnyRef) = x match{
        case e1@List(_,e2@List(5, _*)) => println(s"e1 = ${e1.getClass}, e2 = $e2")
        case _ =>
    }

    pattern1(list)
}
