package packageRule{
    package scala{

        object Utils{
            def toString(x:String) = {
                println(x)
            }
            // outer package and not access class or object from outer package
            // if you want to use, using import
            import packageRule.scala.chapter08._
            def getTeacher(): Teacher = new Teacher("John")
        }


        package chapter08{
            class Teacher(var name:String){
                // inner package can access class or object from outer package
                def printName() = Utils.toString(name)
            }
        }
    }
}


object PackageScope {
    import packageRule.scala._
    import packageRule.scala.chapter08._
    def main(args:Array[String]): Unit = {
        Utils.toString(new Teacher("John").name)
        new Teacher("Mike").printName()
    }

}
