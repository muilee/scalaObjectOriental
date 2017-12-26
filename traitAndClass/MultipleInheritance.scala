package traitAndClass


// when calling the print method, instance c will use "right postorder DFS" to search
object MultipleInheritance extends App {
    trait A{
        def print:Unit
    }

    trait B1 extends A{
        val B1 = "Trait B1"

        override def print = println(B1)
    }

    trait B2 extends A{
        val B2 = "Trait B2"

        override def print = println(B2)
    }

    class C extends B1 with B2

    val c = new C
    c.print
}
