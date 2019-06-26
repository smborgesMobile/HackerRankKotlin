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

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(matrix: Array<Array<Int>>): Int {

    var mainDiagonalSum = 0
    var secondaryDiagonal = 0

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix.size) {
            val value = matrix[i][j]

            //Verify if the index is from main diagonal
            if (i == j) {
                mainDiagonalSum += value
            }

            //Verify if the index is from secondary diagonal
            if (i == matrix.size - j - 1) {
                secondaryDiagonal += value
            }
        }
    }

    return Math.abs(mainDiagonalSum - secondaryDiagonal)
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
