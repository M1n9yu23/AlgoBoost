package basic


class BasicMainCode {

    companion object {
        fun solution(num_list: IntArray): IntArray {
            val last = num_list.last()
            val lastPrev = num_list[num_list.size - 2]

            return num_list + if(last > lastPrev) last - lastPrev else last * 2
        }
    }
}

fun main() {
    println(BasicMainCode.solution(intArrayOf(2,1,6)).toList())
}