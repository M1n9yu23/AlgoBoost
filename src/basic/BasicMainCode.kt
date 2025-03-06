package basic

class BasicMainCode {

    companion object {
        fun solution(number: String) = number.sumOf { it - '0' } % 9
    }
}

fun main() {
    println(BasicMainCode.solution("78720646226947352489"))
}