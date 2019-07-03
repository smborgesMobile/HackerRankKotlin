import java.util.*

// Complete the hourglassSum function below.
fun hourglassSum(matrix: Array<Array<Int>>): Int {
    var maxValue = Integer.MIN_VALUE

    for (i in 0 until matrix.size - 2) {
        for (j in 0 until matrix.size - 2) {
            val currentNumber = matrix[i][j]
            val topSide = matrix[i][j + 1] + matrix[i][j + 2]
            val middle = matrix[i + 1][j + 1]
            val bottomSide = matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2]
            val totalSum = (currentNumber) + (topSide) + (middle) + (bottomSide)

            maxValue = Math.max(totalSum, maxValue)
        }
    }

    return maxValue
}

fun main() {
    val scan = Scanner(System.`in`)

    val arr = Array(6) { Array(6) { 0 } }

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
