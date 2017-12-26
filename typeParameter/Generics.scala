package typeParameter

object Generics extends App {
    val arrStr: Array[String] = Array("Hadoop", "Hive", "Spark")
    val arrInt: Array[Int] = Array(1, 2, 3)

    printAll(arrStr)
    printAll(arrInt)

    def printAll(x: Array[T] forSome {type T}) = {
        for(i <- x){
            print(i + " ")
        }
        println()
    }

//    you can also write
//    def printAll(x: Array[_]) = {
//        for(i <- x){
//            print(i + " ")
//        }
//        println()
//    }
}
