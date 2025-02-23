package basic

class BasicMainCode {

    // 세균 증식
    companion object{
        fun solution(n: Int, t: Int): Int = n shl t
    }
}

fun main(){
    println(BasicMainCode.solution(2,10))
}