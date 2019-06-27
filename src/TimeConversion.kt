import java.text.SimpleDateFormat
import java.util.*

fun timeConversion(currentHour: String): String {

    val inputFormat = SimpleDateFormat("hh:mm:ssaa")
    val outputFormat = SimpleDateFormat("HH:mm:ss")

    val date = inputFormat.parse(currentHour)

    return outputFormat.format(date!!)
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
