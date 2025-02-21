package basic

class BasicMainCode {

    // 짝수의 합
    companion object{
        fun solution(str1: String, str2: String): Int {
            val len1 = str1.length
            val len2 = str2.length

            for (i in 0..(len1 - len2)) {
                var bool = true

                for(j in 0 until len2){
                    if(str1[i + j] != str2[j]){
                        bool = false
                        break
                    }
                }

                if(bool) {
                    return 1
                }
            }

            return 2
        }
    }
}

fun main(){
    println(BasicMainCode.solution("ab6CDE443fgh22iJKlmn1o", "6CD"))
}