package solution

/**
 * @param N 스테이지 개수
 * @param stages 사용자가 정지한 스테이지 번호
 * @return 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담긴 배열
 */
private fun solution(N: Int, stages: IntArray): IntArray{
    val stageCount = IntArray(N+2)
    for(stage in stages){
        stageCount[stage]++
    }

    val failureRate = mutableListOf<Pair<Int, Double>>()
    var totalPlayer = stages.size

    for(stage in 1..N){
        if(totalPlayer == 0) {
            failureRate.add(Pair(stage,0.0))
        } else {
            val failRate = stageCount[stage].toDouble() / totalPlayer
            failureRate.add(Pair(stage, failRate))
        }
        totalPlayer -= stageCount[stage]
    }

    return failureRate.sortedWith(compareByDescending<Pair<Int, Double>> { it.second } // 실패율 높은 순
        .thenBy { it.first }) // 실패율 같은 경우 스테이지 번호를 기준으로 오름차순 정렬
        .map { it.first } // 변환 함수로 스테이지 번호만 추출
        .toIntArray()
}