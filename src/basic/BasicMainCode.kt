package basic

class BasicMainCode {

    companion object {
        fun solution(my_string: String, queries: Array<IntArray>): String {
            val arr = my_string.toCharArray()

            for(i in queries) {
                val (s, e) = i
                var l = s
                var r = e

                while(l < r) {
                    val t = arr[l]
                    arr[l] = arr[r]
                    arr[r] = t
                    l++
                    r--
                }
            }

            return arr.joinToString("")
        }
    }
}

fun main() {
    val myString = "rermgorpsam"
    val queries = arrayOf(
        intArrayOf(2, 3),
        intArrayOf(0, 7),
        intArrayOf(5, 9),
        intArrayOf(6, 10)
    )
    println(BasicMainCode.solution(myString, queries))
}