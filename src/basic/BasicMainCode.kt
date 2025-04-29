package basic

class BasicMainCode {

    companion object {
        fun solution(arr1: IntArray, arr2: IntArray): Int {
            return if(arr1.size > arr2.size) 1
            else if(arr1.size == arr2.size) {
                if(arr1.sum() > arr2.sum()) 1
                else if (arr1.sum() < arr2.sum()) -1
                else 0
            } else -1
        }
    }
}

fun main() {
    println(BasicMainCode.solution(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 3, 3, 3, 3)))
}