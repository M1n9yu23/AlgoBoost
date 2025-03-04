package basic

class BasicMainCode {

    companion object {
        fun solution(arr: IntArray): IntArray {
            val stk = ArrayDeque<Int>()

            for (num in arr) {
                while (stk.isNotEmpty() && stk.last() >= num) {
                    stk.removeLast()
                }
                stk.addLast(num)
            }

            return stk.toIntArray()
        }
    }
}

fun main() {

    println(BasicMainCode.solution(intArrayOf(1,4,2,5,3)).joinToString(","))
}