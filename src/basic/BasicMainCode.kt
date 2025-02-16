package basic

class BasicMainCode {

    companion object{
        fun solution(n: Int, k: Int): Int = (n * 12000) + ((k - (n / 10)) * 2000)
    }
}

fun main(){
    println(BasicMainCode.solution(64, 6))
}