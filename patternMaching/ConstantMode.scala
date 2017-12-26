package patternMaching

object ConstantMode extends App {
    for (i <- 1 to 5){
        i match {
            case 1 => println(1)
            case 2 => println(2)
            case 3 => println(3)
            case _ => println("other")
        }
    }
}
