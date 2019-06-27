import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var numbersOfZero = 0
    var numbersOfPositive = 0
    var numbersOfNegative = 0

    for (value: Int in arr) {
        when {
            value > 0 -> numbersOfPositive++
            value < 0 -> numbersOfNegative++
            else -> numbersOfZero++
        }
    }
    formatAndPrintValue(numbersOfPositive.div(arr.size.toFloat()))
    formatAndPrintValue(numbersOfNegative.div(arr.size.toFloat()))
    formatAndPrintValue(numbersOfZero.div(arr.size.toFloat()))

}

fun formatAndPrintValue(number: Float) {
    println("%.6f".format(number))
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
