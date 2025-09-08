package week1.ch02

fun main(){
    val b: Int = 0B011111
    val i: Byte = b.toByte()

    println(i)
    println(b.toString()) // toString 함수의 인자는 진수 toString(16) = 16진수로
}