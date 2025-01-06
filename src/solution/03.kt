package solution

/**
 * 두개 뽑아서 더하기
 *
 * [2,1,3,4,1] => [2,3,4,5,6,7]
 */

// 함수형 프로그래밍 스타일로 작성
private fun solution(numbers: IntArray): IntArray {
    return numbers.indices.flatMap { i ->
        (i + 1 until numbers.size).map { j ->
            numbers[i] + numbers[j]
        }
    }.distinct().sorted().toIntArray()
}

fun main(){
    println(solution(intArrayOf(2,1,3,4,1)).contentToString())
}



//private fun solution(numbers: IntArray): IntArray {
//    val answer = mutableListOf<Int>()
//    for(i in numbers.indices){
//        for(j in i+1 until numbers.size){
//            answer += numbers[i] + numbers[j]
//        }
//    }
//    return answer.distinct().sorted().toIntArray()
//}