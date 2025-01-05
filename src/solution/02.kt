package solution


/**
 * 배열 제어
 */

private fun solution(arr: IntArray): IntArray{
    val cloneArr = arr.clone().distinct()

    return cloneArr.sortedDescending().toIntArray()
}

fun main() {
    println(solution(intArrayOf(4, 2, 2, 1, 3, 4)).contentToString())
    println(solution(intArrayOf(2, 1, 1, 3, 2, 5, 4)).contentToString())
}