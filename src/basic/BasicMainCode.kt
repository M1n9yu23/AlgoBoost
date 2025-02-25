package basic

import kotlin.math.pow


class BasicMainCode {

    companion object {
        fun solution(num_list: IntArray) = if (num_list.reduce { acc, num -> acc * num } < num_list.sum().let { it * it }) 1 else 0
    }
}

fun main() {
    println(BasicMainCode.solution(intArrayOf(3,4,5,2,1)))
}