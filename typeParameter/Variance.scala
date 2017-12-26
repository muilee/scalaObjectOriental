package typeParameter

object Variance extends App {

    // covariance
    class List[+T](val head: T, val tail: List[T]){
        def prepend[U >: T](newHead:U):List[U] = new List(newHead, this)

        override def toString() = " " + head
    }
    val list: List[Any] = new List[String]("head", null)

    // contravariance
    class Person[-A] {
        def test(x:A): Unit = {
            println(x)
        }
    }

    val pAny = new Person[Any]
    val pStr :Person[String] = pAny
    pStr.test("contravariance test")
}
