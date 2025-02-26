package basic


class BasicMainCode {

    companion object {
        fun solution(n: Int, control: String): Int {
            var num = n
            control.forEach {
                when(it){
                    'w' -> num++
                    's' -> num--
                    'd' -> num += 10
                    'a' -> num -= 10
                }
            }

            return num
        }
    }
}

fun main() {
    println(BasicMainCode.solution(0, "wsdawsdassw"))
}