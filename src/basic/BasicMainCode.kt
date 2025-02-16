package basic

import kotlin.math.sqrt

class BasicMainCode {

    companion object{
        fun solution(n: Int): Int {
            var sum = 0
            for(i in 1..sqrt(n.toDouble()).toInt()){
                if(n % i == 0){
                    sum += i
                    if (i != n / i) {
                        sum += n / i
                    }
                }
            }
            return sum
        }
    }
}

fun main(){
    println(BasicMainCode.solution(5))
}