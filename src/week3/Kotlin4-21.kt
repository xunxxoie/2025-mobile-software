package week3

import java.lang.Integer.sum

fun highOrFunc(a:Int, b:Int, c:(Int, Int) -> Int): Int{
    return sum(a,b)
}

fun main(){
    val result = highOrFunc(10,20) {a: Int, b: Int -> a+b}
    println(result)
}