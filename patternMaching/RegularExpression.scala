package patternMaching

object RegularExpression extends App {

    // in java
    import java.util.regex.Pattern

    val line = "scala has been the most popular big data programming language since 2014-01-01"
    val regex = "(\\d{4})-(\\d{2})-(\\d{2})"

    val pattern = Pattern.compile(regex)
    val m = pattern.matcher(line)

    if (m.find()){
        println(m.group(0))
        println(m.group(1))
        println(m.group(2))
        println(m.group(3))
    }else{
        println("can not match anything")
    }
    println("================")

    //in scala

    val regex1 = """(\d{4})-(\d{2})-(\d{2})""".r

    println("findAllIn method")
    for (date <- regex1 findAllIn "2015-12-31 2016-10-22"){
        println(date)
    }
    println("================")

    println("findAllMatchIn method")
    for (date <- regex1 findAllMatchIn  "2015-12-31 2016-10-22"){
        println(date.groupCount)
    }
    println("================")


    val dateP2 = new scala.util.matching.Regex("""(\d{4})-(\d{2})-(\d{2})""", "year", "month", "day")
    val result = dateP2 findFirstMatchIn "2015-12-31 2016-10-22" match {
        case Some(m) => "year : " + m.group("year")
        case None => "can not match anything"
    }
    println(result)

    println("============")
    val text = "from 2011-07-15 to 2011-07-19"
    val repl = dateP2 replaceAllIn(text, m => m.group("year") + "/" + m.group("month")+ "/" + m.group("day"))
    println(repl)

}
