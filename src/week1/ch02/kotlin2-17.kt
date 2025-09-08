package week1.ch02

fun main(){
    var num: Number = 8L
    typeCheck(num);
}

fun typeCheck(x :Any){
    when(x){
        is Int -> println("Int")
        is Long -> println("Long")
        else -> println("other")
    }
}