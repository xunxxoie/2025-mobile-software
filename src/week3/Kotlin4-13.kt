package week3

fun main(){
    val s = "i am bear"
    println(s.lowercase())

    val strToLower1: (String) -> String = String::lowercase
    println(strToLower1(s))

    val strToLower2: String.() -> String = String::uppercase
    println(s.strToLower2())

    val n: Int = 10
    val intTimes: Int.(Int) -> Int = Int::times
    println(n.intTimes(5))

    println(intTimes(5,10))
}