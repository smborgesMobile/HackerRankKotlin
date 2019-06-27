import java.util.*

// Complete the staircase function below.
fun staircase(n: Int) {
    val arrayOfValues = Array(n) { i -> i + 1 }

    arrayOfValues.forEach {
        printSpace(it, arrayOfValues.size)
        printStairCase(it)
    }
}

fun printSpace(index: Int, size: Int) {
    val numberOfSpaces = size - index
    calcTheNumberOfSpaces(numberOfSpaces)
}

fun calcTheNumberOfSpaces(numberOfSpaces: Int) {
    if (numberOfSpaces > 0) {
        print(" ")
        calcTheNumberOfSpaces(numberOfSpaces - 1)
    }
}


fun printStairCase(numberOfRounds: Int) {
    if (numberOfRounds > 0) {
        print("#")
        printStairCase(numberOfRounds - 1)
    } else {
        println()
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
