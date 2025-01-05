package solution


/**
 * 배열 정렬
 */

private fun solution(arr: IntArray): IntArray{
    val cloneArr = arr.clone()
    cloneArr.sort()
    return cloneArr
}

fun main() {
    println(solution(intArrayOf(1, -5, 2, 4, 3)).contentToString())
    println(solution(intArrayOf(2, 1, 1, 3, 2, 5, 4)).contentToString())
    println(solution(intArrayOf(6, 1, 7)).contentToString())
}