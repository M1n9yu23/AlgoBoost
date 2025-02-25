package basic

class BasicMainCode {

    companion object{
        fun solution(a: Int, d: Int, included: BooleanArray): Int {
            var sum = 0
            var current = a

            for(isIncluded in included) {
                if(isIncluded) {
                    sum += current
                }
                current += d
            }

            return sum
        }
    }
}

fun main(){
    println(BasicMainCode.solution(3,4, booleanArrayOf(true, false, false, true, true)))
}