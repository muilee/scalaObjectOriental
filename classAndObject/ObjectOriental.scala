package classAndObject

object ObjectOriental {
    object Student{
        private var studentNo: Int = 0

        def uniqueStudentNo() = {
            studentNo += 1
            studentNo
        }
    }

    def main(args: Array[String]): Unit ={
        println(Student.uniqueStudentNo())
        println(Student.uniqueStudentNo())
        println(Student.uniqueStudentNo())
    }
}
