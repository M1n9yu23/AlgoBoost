package basic

class BasicMainCode {

    companion object{
        fun solution(my_string: String, letter: String): String {
            var result = ""
            val letterChar = letter[0]

            for(i in my_string.indices){
                if(my_string[i] != letterChar) {
                    result += my_string[i]
                }
            }

            return result
        }
    }
}

fun main(){
    println(BasicMainCode.solution("abcdef", "f"))
}