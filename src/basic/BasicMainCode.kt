package basic

import kotlin.math.abs

class BasicMainCode {

    companion object {
        fun solution(my_string: String, index_list: IntArray): String {
            var str = ""

            for(i in index_list) {
                str += my_string[i]
            }

            return str
        }
    }
}

fun main() {

    println(BasicMainCode.solution("cvsgiorszzzmrpaqpe",intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)))
}