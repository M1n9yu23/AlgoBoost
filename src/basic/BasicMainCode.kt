package basic

class BasicMainCode {

    companion object {
        fun solution(myString: String): IntArray {
            val st = myString.split("x")
            val result = IntArray(st.size)
            st.forEachIndexed { i, e ->
                result[i] = e.length
            }

            return result
        }
    }
}

fun main() {
    println(BasicMainCode.solution("oxooxoxxox").joinToString())
}