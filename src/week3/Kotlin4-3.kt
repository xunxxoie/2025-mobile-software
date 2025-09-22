package week3

fun main(){
    println(findVolume(2,3))
    println(findVolume(2,3, 10))
    println(findVolume(width = 10 , length = 10)) // ㅁㅐ개변수 위치 바꾸기 가능


}

fun findVolume(length:Int, width: Int, height: Int=10) = length * width * height