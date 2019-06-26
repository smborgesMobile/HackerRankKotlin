import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alicePoints = 0
    var bobbyPoints = 0

    for ((index, item) in a.withIndex()) {
        when {
            item > b[index] -> alicePoints++
            item < b[index] -> bobbyPoints++
        }
    }

    return arrayOf(alicePoints, bobbyPoints)
}

fun main() {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
