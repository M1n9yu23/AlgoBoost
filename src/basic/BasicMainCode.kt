package basic

class BasicMainCode {

    companion object{
        fun solution(n: Int) = if (n % 2 == 0) (1..n).filter { it % 2 == 0 }.sumOf { it * it } else (1..n).filter { it % 2 != 0 }.sum()
    }
}

fun main(){
    println(BasicMainCode.solution(10))
}