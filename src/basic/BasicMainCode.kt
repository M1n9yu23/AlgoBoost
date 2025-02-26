package basic

import jdk.internal.org.jline.utils.Colors.s


class BasicMainCode {

    companion object {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {

            val answer = IntArray(queries.size) { -1 }

            queries.forEachIndexed { index, (s, e, k) ->
                var min = Int.MAX_VALUE

                for (i in s..e) {
                    if (arr[i] > k && arr[i] < min) {
                        min = arr[i]
                    }
                }

                if (min != Int.MAX_VALUE) {
                    answer[index] = min
                }
            }

            return answer
        }
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 2, 4, 3)
    val queries = arrayOf(
        intArrayOf(0, 4, 2),
        intArrayOf(0, 3, 2),
        intArrayOf(0, 2, 2)
    )
    println(BasicMainCode.solution(arr, queries).joinToString(", "))
}