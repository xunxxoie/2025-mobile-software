package week3

fun String.add(n: Int): String = this.repeat(n)

fun main(){
    var str = "Hello Kotlin "
    println(str.add(2))
}