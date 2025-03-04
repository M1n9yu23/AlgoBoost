package basic

class BasicMainCode {

    companion object {
        fun solution(n: Int): IntArray {
            var x = n
            val arr = mutableListOf<Int>()
            while(true) {
                arr.add(x)
                if(x == 1) break
                x = if(x % 2 == 0) x / 2 else 3 * x + 1
            }

            return arr.toIntArray()
        }
    }
}

fun main() {

    println(BasicMainCode.solution(10).joinToString(","))
}