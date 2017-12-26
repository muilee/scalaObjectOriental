package classAndObject

object AuxiliaryConstructor extends App {
    class Person (){
        private var name: String = null
        private var age: Int = 18
        private var sex: Int = 0

        def this(name: String){
            this()
            this.name = name
        }

//        def this(name:String, age:Int){
//            this()
//            this.name = name
//            this.age = age
//        }

        def this(name:String, age:Int){
            this(name)
            this.age = age
        }

        def this(name:String, age:Int, sex:Int){
            this(name, age)
            this.sex = sex
        }

        override def toString: String = {
            val sexStr = if(sex == 1) "男" else "女"
            s"name=$name, age=$age, sex=$sexStr"
        }
    }
    // call auxiliary constructor with 3 parameter
    println(new Person("John", 19, 1))

    // call auxiliary constructor with 2 parameter
    println(new Person("John", 19))

    // call auxiliary constructor with 1 parameter
    println(new Person("John"))
}
