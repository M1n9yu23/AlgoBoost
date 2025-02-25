package basic


class BasicMainCode {

    companion object {
        fun solution(num_list: IntArray) = num_list.filter { it % 2 == 0 }.joinToString("").toInt() + num_list.filter { it % 2 != 0 }.joinToString("").toInt()
    }
}

fun main() {
    println(BasicMainCode.solution(intArrayOf(3,4,5,2,1)))
}