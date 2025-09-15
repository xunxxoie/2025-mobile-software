package week2

fun main(){
    val a = 9
    val b = 8

    if(a>=b)
        println("A large value is $a")
    else
        println("B large value is $b")
        println("B large value is $b")

    val max = if(a>=b) a else b
    println(max)
}