package basic

class BasicMainCode {

    companion object {
        fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean) = (x1 || x2) && (x3 || x4)
    }
}

fun main() {

    println(BasicMainCode.solution(true,false,false,false))
}