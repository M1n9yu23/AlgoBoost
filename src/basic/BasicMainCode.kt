package basic

class BasicMainCode {

    // 짝수의 합
    companion object{
        fun solution(n: Int): Int = (0..n).filter{
            it % 2 == 0
        }.sum()
    }
}

fun main(){
    println(BasicMainCode.solution(10))
}