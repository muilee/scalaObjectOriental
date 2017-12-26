package automaticConversion

object MultiConversion extends App {
    class TestA{
        override def toString: String = "this is TestA"
        def printA = println(this)
    }

    class TestB{
        override def toString: String = "this is TestB"
        def printB(x:TestC) = println(x)
    }

    class TestC{
        override def toString: String = "this is TestC"
        def printC = println(this)
    }

    implicit def A2B(x:TestA) = {
        println("TestA is being converted to TestB")
        new TestB
    }

    implicit def B2C(x:TestB) = {
        println("TestB is being converted to TestC")
        new TestC
    }

    val a = new TestA

    a.printB(new TestB)
}
