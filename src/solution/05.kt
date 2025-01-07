package solution

/**
 * 행렬의 곱셈
 *
 * 곱셈 할 수 있는 형태로 제공 되니깐 조건은 X
 */

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return arr1.map { row1 ->
        IntArray(arr2[0].size) { colIndex ->
            row1.indices.sumOf{ row1[it] * arr2[it][colIndex] }
        }
    }.toTypedArray()
}

fun main(){
    val arr1 = arrayOf(
        intArrayOf(1, 4),
        intArrayOf(3, 2),
        intArrayOf(4, 1)
    )
    val arr2 = arrayOf(
        intArrayOf(3, 3),
        intArrayOf(3, 3)
    )
    val result = solution(arr1, arr2)
    result.forEach { println(it.contentToString()) }
}