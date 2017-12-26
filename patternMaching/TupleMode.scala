package patternMaching

object TupleMode extends App {

    val tupleInt = (1,2,3,4)
    def pattern(x:AnyRef) = x match {
        case (first, second) => println(s"first=$first, second=$second")

        // con not use _*
        case (first, _, third, _) => println(s"first=$first, third=$third")
        case _ =>
    }
    pattern(tupleInt)
}
