package patternMaching


// usually be used to compare collections
object SequenceMode extends App {
    val arrInt = Array(1,2,3,4)
    def pattern(x: AnyRef) = x match {
        case Array(first, second) => println(s"first=$first, second=$second")
        case Array(first, _, third, _*) => println(s"first=$first, third=$third")
        case _ =>
    }
    pattern(arrInt)
}
