package basic

import kotlin.math.pow


class BasicMainCode {

    companion object {
        fun solution(a: Int, b: Int, c: Int): Int {
            val dice = listOf(a, b, c)
            val x2 = dice.sumOf { it * it }
            val x3 = dice.sumOf { it * it * it}
            val sum = dice.sum()
            return when (dice.toSet().size) {
                1 -> sum * x2 * x3
                2 -> sum * x2
                else -> sum
            }
        }
    }
}

fun main() {
    println(BasicMainCode.solution(4, 4, 4))
}