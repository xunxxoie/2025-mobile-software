package week1.ch02

fun main(){
    var s1 = "Hello"
    var s2 = "world"

    // 각각 생성
    var s3 = String("Hello".toCharArray())
    var s4 = String("Hello".toCharArray())
    println(s3 === s4)

    s3 = s3.intern() // String pool에 해당 문자열이 있는지 -> Hello 반환
    s4 = s4.intern()

    print(s3 === s4)
}