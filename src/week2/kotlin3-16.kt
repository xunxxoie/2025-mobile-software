package week2

fun main(){
    val smallRange = 'a' .. 'b'
    if('k' in smallRange)
        println("found k in $smallRange")
    if('9' !in smallRange)
        println("Not found 9 in $smallRange")

    println(isLetter('q'))
    println(isNotDigit('*'))
}

fun isLetter(c: Char) = ('a'..'z').contains(c) || ('A'..'Z').contains(c)
fun isNotDigit(c: Char) = c !in '0'..'9'
