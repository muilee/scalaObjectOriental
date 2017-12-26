package traitAndClass


object MultipleInheritanceWithSuper extends App {
    trait A{
        val a = "Trait A"
        println("print in A")
        def print(msg:String) = println(msg + ":" + a)
    }

    trait B1 extends A{
        val b1 = "Trait B1"
        println("print in B1")
        override def print(msg:String) = super.print(msg + ":" + b1)
    }

    trait B2 extends A{
        val b2 = "Trait B2"
        println("print in B2")
        override def print(msg:String) = super.print(msg + ":" + b2)
    }

    class C extends B1 with B2{
        println("print in C")
    }

    val c = new C
    c.print("print method in ")
}
