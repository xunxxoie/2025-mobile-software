package week2

fun main(){
    print("Enter the score:")
    val score = readln().toInt()
    println(gradeWithWhen(score));
}

fun gradeWithWhen(num: Int) : String{
    return when(num) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 0..59 -> "F"
        else -> {
            "범위 벗어남"
        }
    }
}