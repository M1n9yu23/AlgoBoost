package level1


/**
 * @param s 일부 자릿수가 영단어이거나 그대로인 문자열
 * @return 원래 숫자를 리턴
 */
private fun solution(s: String): Int{
    val numberMap = mapOf(
        "zero" to "0", "one" to "1", "two" to "2",
        "three" to "3", "four" to "4", "five" to "5",
        "six" to "6", "seven" to "7", "eight" to "8",
        "nine" to "9"
    )

    return numberMap.entries.fold(s){ acc, (word, num) ->
        acc.replace(word, num)
    }.toInt()
}

fun main(){
    print(solution("one4seveneight"))
}