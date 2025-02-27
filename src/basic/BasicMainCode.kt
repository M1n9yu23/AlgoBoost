package basic

class BasicMainCode {

    companion object {
        fun solution(l: Int, r: Int): IntArray {
            val answer = mutableListOf<Int>()

            for (i in l..r) {
                if(i.toString().all { it == '0' || it == '5'}) {
                    answer.add(i)
                }
            }

            return if(answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
        }
    }
}

fun main() {

    println(BasicMainCode.solution(5, 555).joinToString(","))
}