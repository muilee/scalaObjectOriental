package patternMaching

object TypeMode extends App {
    class A
    class B extends A
    class C extends A
    class D extends B

    val b = new B
    val c = new C

    // a, b is also type A
    def pattern(x: AnyRef) = x match {
        case x: String => println("String type")
        case x: D => println("D type")
        case x: B => println("B type")
        case x: A => println("A type")
        case _ => println("other")
    }

    pattern("Scala")
    pattern(b)
    pattern(c)
}
