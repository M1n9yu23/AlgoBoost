package basic

class BasicMainCode {

    companion object {
        fun solution(arr1: IntArray): IntArray {
            val x = IntArray(arr1.sum())
            var index = 0

            for (i in arr1.indices) {
                var c = arr1[i]
                while(c > 0) {
                    x[index++] = arr1[i]
                    c--
                }
            }

            return x
        }
    }
}

fun main() {
    println(BasicMainCode.solution(intArrayOf(5, 1, 4)).contentToString())
}