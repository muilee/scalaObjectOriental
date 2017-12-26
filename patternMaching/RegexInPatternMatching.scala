package patternMaching

object RegexInPatternMatching extends App {
    val dateRegex = """(\d{4})-(\d{2})-(\d{2})""".r
    val text = "2015-12-31 2016-10-22"

    for (date <- dateRegex findAllIn(text)){
        date match {
            case dateRegex(year, month, day) => println(s"year = $year, month = $month, day = $day")
            case _ =>
        }
    }
    println("========================")

    for (dateRegex(year, month, day) <- dateRegex findAllIn(text)){
        println(s"year = $year, month = $month, day = $day")
    }
}
