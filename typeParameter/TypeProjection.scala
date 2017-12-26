package typeParameter

object TypeProjection extends App {
    class Outer{
        val x: Int = 0
        def test(i:Outer#Inner) = i
        class Inner
    }

    val o1 = new Outer
    val o2 = new Outer

    val i1 = new o1.Inner
    val i2 = new o2.Inner

    o1.test(i1)
    o1.test(i2)
}
