package automaticConversion

import automaticConversion.ImplicitObject.multiply

object ImplicitValue extends App {
    trait Multiplicable[T]{
        def multiply(x:T): T
    }

    class MultiplicableInt extends Multiplicable[Int] {
        def multiply(x: Int): Int = x * x
    }

    class MultiplicableString extends Multiplicable[String] {
        def multiply(x: String): String = x * 2
    }

    def multiply[T: Multiplicable] (x:T) (implicit ev: Multiplicable[T]) = {
        println(ev.multiply(x))
        println(x)
        println(x.getClass)
        println("==============")
    }

    implicit val mInt = new MultiplicableInt
    implicit val mStr = new MultiplicableString
    multiply(5)
    multiply("5")
}
