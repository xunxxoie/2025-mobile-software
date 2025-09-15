package week2

fun main(){
    val r1 = 'a' .. 'f'

    println("c in a..f is ${'c' in r1}")
    println("b in a..f is ${r1.contains('b')}")

    val r2 = "aa" .. "cc"
    val str = "bb"
    println("$str in aa..cc is ${str in r2}")

}