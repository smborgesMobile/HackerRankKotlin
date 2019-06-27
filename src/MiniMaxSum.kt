import java.util.*

fun miniMaxSum(arr: Array<Int>) {
    var minValue = arr.min()
    var maxValue = arr.max()

    var minSum: Long = 0
    var maxSum: Long = 0
    var isEquals = true

    arr.forEach {
        if (it != maxValue) {
            minSum += it
        }

        if (it != minValue) {
            maxSum += it
        }

        if (arr[0] != it) {
            isEquals = false
        }
    }

    if (isEquals) {
        minSum = ((arr.size - 1) * arr[0]).toLong()
        maxSum = minSum
    }

    print("$minSum $maxSum")
}


fun main() {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
