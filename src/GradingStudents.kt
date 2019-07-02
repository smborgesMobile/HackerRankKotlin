/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): IntArray {
    var result = IntArray(grades.size)

    grades.forEachIndexed { index, element ->
        when{
            element < 38 -> result[index] = element
            findTheNextMultipleOfFive(element) - element < 3 -> result[index] = findTheNextMultipleOfFive(element)
            else -> result[index] = element
        }
    }

    return result
}

fun findTheNextMultipleOfFive(item: Int): Int {
    var internal: Int = item
    var division: Float = item.rem(5f)
    while (division != 0f) {
        internal++
        division = internal.rem(5f)
    }
    return internal
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
