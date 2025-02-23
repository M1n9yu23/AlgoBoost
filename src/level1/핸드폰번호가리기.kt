package level1

class Level1Main {

    companion object{
        fun solution(phone_number: String) = "*".repeat(phone_number.length - 4) + phone_number.takeLast(4)

    }
}

fun main(){
    println(Level1Main.solution("027778888"))
}