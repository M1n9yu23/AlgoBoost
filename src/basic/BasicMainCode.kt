package basic

class BasicMainCode {

    companion object {
        fun solution(start_num: Int, end_num: Int) = (start_num..end_num).toList().toIntArray()
    }
}

fun main() {

    println(BasicMainCode.solution(3,10).joinToString(","))
}