import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun aVeryBigSum(listOfItems: Array<Long>): Long {
    var result: Long = 0

    for (item: Long in listOfItems){
        result += item
    }

    return result
}

fun main() {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
