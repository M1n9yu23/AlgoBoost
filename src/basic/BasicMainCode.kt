package basic

class BasicMainCode {

    companion object {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {

            queries.forEach { (s, e, k) ->

                for (i in s..e) {
                    if (i % k == 0){
                        arr[i] +=  1
                    }
                }
            }

            return arr
        }
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 2, 4, 3)
    val queries = arrayOf(
        intArrayOf(0, 4, 1),
        intArrayOf(0, 3, 2),
        intArrayOf(0, 3, 3)
    )
    println(BasicMainCode.solution(arr, queries).joinToString(", "))
}