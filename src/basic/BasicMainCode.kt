package basic


class BasicMainCode {

    companion object {
        fun solution(numLog: IntArray): String = numLog.mapIndexed { i, num ->
            if (i == 0) ""
            else when (num - numLog[i - 1]) {
                1 -> 'w'
                -1 -> 's'
                10 -> 'd'
                -10 -> 'a'
                else -> ""
            }
        }.joinToString("")
    }
}

fun main() {
    println(BasicMainCode.solution(intArrayOf(0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1)))
}