package basic

import kotlin.math.abs

class BasicMainCode {

    companion object {
        fun solution(a: Int, b: Int, c: Int, d: Int): Int {
            val nums = listOf(a,b,c,d)
            val count = mutableMapOf<Int, Int>()

            for(i in nums) {
                count[i] = count.getOrDefault(i, 0) + 1
            }

            if(count.size == 1) {
                return 1111 * a
            }

            for((k,v) in count) {
                if(v == 3) {
                    val oth = count.keys.first { it != k }
                    return (10 * k + oth) * (10 * k + oth)
                }
            }

            if(count.size == 2) {
                val ks = count.keys.toList()
                val vs = count.values.toList()
                if(vs[0] == 2 && vs[1] == 2) {
                    return (ks[0] + ks[1]) * abs(ks[0] - ks[1])
                }
            }

            if(count.size == 3) {
                val pr = count.entries.first { it.value == 2}.key
                val oths = count.keys.filter { it != pr }
                return oths[0] * oths[1]
            }

            return nums.minOrNull()!!
        }
    }
}

fun main() {

    println(BasicMainCode.solution(4,1,4,4))
}