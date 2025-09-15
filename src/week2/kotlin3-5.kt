package week2

fun main(){
    val ch = 'g'
    val range = 'a' .. 'b'

    if( ch in range)
        println("${ch} is in range of ${range}")

    if(range.contains(ch))
        println("${ch} is in range of ${range}")
}