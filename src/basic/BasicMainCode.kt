package basic

class BasicMainCode {

    companion object{
        fun solution(a: Int, b: Int) = maxOf("$a$b".toInt(), 2 * a * b)
    }
}

fun main(){
    println(BasicMainCode.solution(91, 2))
}