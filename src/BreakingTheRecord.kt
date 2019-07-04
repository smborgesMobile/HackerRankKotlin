import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): IntArray {
    var quickStartRecord = scores[0]
    var quickStartRecordWorst = scores[0]
    var numberOfTimesThatSheBreaksTheRecord = 0
    var numberOfTimeThatSheWorstTheRecord = 0
    val result = IntArray(2)

    scores.forEachIndexed { index, item ->
        if (scores[index] > quickStartRecord && scores[index] >= 0) {
            quickStartRecord = scores[index]
            paintNumbers(scores, item, -100)
            numberOfTimesThatSheBreaksTheRecord++
        }

        if (scores[index] in 0..(quickStartRecordWorst - 1)) {
            quickStartRecordWorst = scores[index]
            paintNumbers(scores, item, -200)
            numberOfTimeThatSheWorstTheRecord++
        }
    }

    result[0] = numberOfTimesThatSheBreaksTheRecord
    result[1] = numberOfTimeThatSheWorstTheRecord


    return result
}

fun paintNumbers(scores: Array<Int>, numberToBePainted: Int, color: Int) {
    scores.forEachIndexed { index, score ->
        if (scores[index] == numberToBePainted) {
            scores[index] = color
        }
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
