package basic

class BasicMainCode {

    companion object {
        fun solution(rny_string: String) = rny_string.replace("m", "rn")

    }
}

fun main() {
    println(BasicMainCode.solution("masterpiece"))
}