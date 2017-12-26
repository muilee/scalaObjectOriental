package typeParameter

object MultiBound extends App {
    class A[T]
    class B[B]

    implicit val a = new A[String]
    implicit val b = new B[String]

    // must exist both implicit value or object (A[T] and B[T])
    def test[T:A:B](x:T) = println(x)
    test("test")

    implicit def t2A[T](x:T) = new A[T]
    implicit def t2B[T](x:T) = new B[T]

    // must exist two implicit methods,one can convert T to A and the other can convert T to B
    def test2[T <% A[T] <% B[T]](x:T) = println(x)
    test2("test2")
}
