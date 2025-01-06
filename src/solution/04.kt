package solution


/**
 * 모의고사
 * @param 문제의 정답이 순서대로 저장된 배열
 *
 * @return 문제를 가장 많이 맞힌 사람이 누구인지 확인 (배열)
 */
private fun solution(answers: IntArray): IntArray {
    val ptrn1 = intArrayOf(1, 2, 3, 4, 5)
    val ptrn2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val ptrn3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    val scores = intArrayOf(0,0,0)

    answers.indices.forEach{ index ->
        if(answers[index] == ptrn1[index % ptrn1.size]) scores[0]++
        if(answers[index] == ptrn2[index % ptrn2.size]) scores[1]++
        if(answers[index] == ptrn3[index % ptrn3.size]) scores[2]++
    }

    return scores.indices.filter{ scores[it] == scores.maxOrNull()!! }.map { it + 1}.toIntArray()
}

fun main() {
    println(solution(intArrayOf(1, 2, 3, 4, 5)).contentToString()) // [1]
    println(solution(intArrayOf(1, 3, 2, 4, 2)).contentToString()) // [1, 2, 3]
}