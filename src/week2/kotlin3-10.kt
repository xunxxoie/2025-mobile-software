package week2

fun main(){
    val x = 10
    val y = 4

    val result = when{
        x > y -> "${x} > ${y}"
        x < y -> "${x} < ${y}"
        else -> "${x} = ${y}"
    }

    println(result)
}