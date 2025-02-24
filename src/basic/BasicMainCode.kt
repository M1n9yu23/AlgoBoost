package basic

class BasicMainCode {

    companion object{
        fun solution(a: Int, b: Int, flag: Boolean) = when(flag) {
            true -> a + b
            false -> a - b
        }
    }
}

fun main(){
    println(BasicMainCode.solution(-4,7,true))
}