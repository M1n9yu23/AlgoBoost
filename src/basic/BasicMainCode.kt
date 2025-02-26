package basic

import javax.management.QueryExp


class BasicMainCode {

    companion object {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
            queries.forEach {
                val (i, j) = it
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }

            return arr
        }
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 2, 3, 4)
    val queries = arrayOf(
        intArrayOf(0, 3),
        intArrayOf(1, 2),
        intArrayOf(1, 4)
    )
    println(BasicMainCode.solution(arr, queries).joinToString(", "))
}