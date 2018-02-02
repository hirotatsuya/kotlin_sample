import java.util.Date
import java.time.LocalDate
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    println("fromDateToTimestamp")
    val PATTERN = "yyyy-MM-dd"
    var date = LocalDate.now()
    println(date)
    var str: String = date.toString()
    println(str)
    var aaa: Date = SimpleDateFormat(PATTERN).parse(str)
    println(aaa)
    val ts = aaa.getTime()
    println(ts)
}
