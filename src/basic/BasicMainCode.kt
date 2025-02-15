package basic

import kotlin.math.roundToInt


class BasicMainCode {
    /**
     * @param numbers 정수 배열
     * @return 원소 평균값
     */
    fun solution(numbers: IntArray): Double {
        val avg = numbers.average()
//        return (avg * 2).roundToInt() / 2.0
//        return ((avg * 2).toInt() + 0.5).toInt() / 2.0
        val decimal = avg - avg.toInt()

        return when {
            decimal < 0.25 -> avg.toInt().toDouble()
            decimal < 0.75 -> avg.toInt() + 0.5
            else -> avg.toInt() + 1.0
        }
    }
}
