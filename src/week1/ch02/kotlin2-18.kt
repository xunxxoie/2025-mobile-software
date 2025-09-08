package week1.ch02

fun main(){
    val str1: Any? = null
    val str2: String? = str1 as? String
    println(str2)
}