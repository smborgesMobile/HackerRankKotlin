import java.util.*

// Complete the rotLeft function below.
fun rotLeft(array: Array<Int>, rotations: Int): IntArray {
    var result = IntArray(array.size)

    array.forEachIndexed { index, item ->
        val newIndex = (index + rotations) % array.size
        result[index] = array[newIndex]
    }
    return  result
}

fun main() {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
