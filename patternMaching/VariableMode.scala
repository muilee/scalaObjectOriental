package patternMaching

object VariableMode extends App {
    for (i <- 1 to 6){
        i match {
            case 1 => println(1)
            case x if (x % 2 == 0) => println(s"$x can be divided by 2")
            case _ =>
        }
    }

    def pattern(x:Int) = x match {
        case i if (i % 2 == 0) => println(s"$i can be divided by 2")
        case i if (i % 3 == 0) => println(s"$i can be divided by 3")
        case i => println(s"$i can not be divided by 2 and 3")
    }
    println("================")
    println(pattern(5))
    println(pattern(4))
    println(pattern(3))
}

