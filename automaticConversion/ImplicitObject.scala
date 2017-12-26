package automaticConversion

object ImplicitObject extends App {
    trait Multiplicable[T]{
        def multiply(x:T): T
    }

    implicit object MultiplicableInt extends Multiplicable[Int] {
        override def multiply(x: Int): Int = x * x
    }

    implicit object MultiplicableString extends Multiplicable[String] {
        override def multiply(x: String): String = x * 2
    }

    def multiply[T: Multiplicable] (x:T) = {
        val ev = implicitly[Multiplicable[T]]
        println(ev.multiply(x))
        println(x)
        println(x.getClass)
        println("==============")
    }

    multiply(5)
    multiply("5")
}
