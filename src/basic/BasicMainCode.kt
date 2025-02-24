package basic

class BasicMainCode {

    companion object{
        fun solution(a: Int, b: Int): Int {
            val x = "$a$b".toInt()
            val y = "$b$a".toInt()
            return maxOf(x, y)
        }
    }
}

fun main(){
    println(BasicMainCode.solution(12, 3))
}