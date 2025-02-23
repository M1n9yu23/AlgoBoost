package basic

class BasicMainCode {

    // 편지
    companion object{
        fun solution(message: String): Int = message.length * 2
    }
}

fun main(){
    println(BasicMainCode.solution("I love you~"))
}