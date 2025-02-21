package basic

class BasicMainCode {

    // 짝수의 합
    companion object{
        fun solution(num_list: IntArray): IntArray =
            num_list.mapIndexed { index, _ -> num_list[num_list.size - 1 - index] }.toIntArray()
    }
}

fun main(){
    println(BasicMainCode.solution(intArrayOf(1,2,3,4,5)))
}