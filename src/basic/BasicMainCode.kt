package basic

class BasicMainCode {

    companion object {
        fun solution(my_string: String, n: Int) = my_string.substring(0 until n)
    }
}

fun main() {
    println(BasicMainCode.solution("He110W0r1d", 5))
}