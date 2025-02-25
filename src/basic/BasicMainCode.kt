package basic

class BasicMainCode {

    companion object{
        fun solution(code: String): String {
            var mode = 0
            var result = ""

            code.forEachIndexed { index, char ->
                when {
                    char == '1' -> mode = 1 - mode
                    (mode == 0 && index % 2 == 0) || (mode == 1 && index % 2 != 0) -> {
                        result = result.plus(char)
                    }
                }
            }

            return if (result.isEmpty()) "EMPTY" else result
        }
    }
}

fun main(){
    println(BasicMainCode.solution("abc1abc1abc"))
}