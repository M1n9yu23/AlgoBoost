package basic

class BasicMainCode {

    companion object{
        fun solution(n: Int): Int = n.toString().sumOf{
            it - '0'
        }
    }
}

fun main(){
    println(BasicMainCode.solution(123))
}