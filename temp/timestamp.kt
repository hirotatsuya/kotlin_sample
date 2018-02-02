import java.util.Date
import java.time.LocalDate
import java.text.SimpleDateFormat
import java.sql.Timestamp

fun main(args: Array<String>) {
    println("timestamp")
    val ts: Long = 1517114651
    // Unix時間とJavaには差がある
    val tss = Timestamp(ts * 1000).toLocalDateTime()
    println(tss)
}
