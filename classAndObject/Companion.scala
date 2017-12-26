package classAndObject

object Companion extends App {
    class Student {
        private var name: String = null
        def getStudentNo() = {
            Student.uniqueStudentNo()
            Student.studentNo
        }
    }

    object Student {
        private var studentNo: Int = 0
        def uniqueStudentNo() = {
            studentNo += 1
            studentNo
        }

        def printStudentName() = println(new Student().name)
    }
//    can not access
//    println(Student.studentNo)
//    println(new Student().name)

    println((new Student).getStudentNo())
    println(Student.printStudentName())
}
