import java.util.*

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val maxValue = candles.max()
    var result = 0

    candles.forEach {
        when (it) {
            maxValue -> result++
        }
    }
    return result
}

fun main() {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
