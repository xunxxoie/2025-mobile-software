package week2

fun main(){
    val r1 = 1 .. 5
    val r2 = 1.rangeTo(5)
    val r22 = 1.until(6)
    println(r22.joinToString())

    val r3 = 5 downTo 1
    val v4 = 5.downTo(1)

    val v5 = 1 .. 10 step 2
    val r6 = 10 downTo 1 step 2
}