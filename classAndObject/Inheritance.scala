package classAndObject

object Inheritance extends App {

//    var can not override

//    class Person(val name:String, var age:Int){
//        override def toString: String = "name=" + name + ", age=" + age
//    }
//
//    class Student(override val name:String, age:Int, var studentNo:String) extends Person(name, age){
//        override def toString: String = super.toString + ", studentNo=" + studentNo
//    }


    class Person(var name:String, var age:Int){
        override def toString: String = "name=" + name + ", age=" + age
    }

    class Student(name:String, age:Int, var studentNo:String) extends Person(name, age){
        override def toString: String = super.toString + ", studentNo=" + studentNo
    }

    println(new Person("John", 18))
    println(new Student("Nancy", 19, "140116"))
}
