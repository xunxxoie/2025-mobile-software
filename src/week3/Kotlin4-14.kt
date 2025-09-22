package week3

fun mul(a: Int, b: Int, func:(Int, Int) -> Int): Int{
    return func(a,b)
}

fun myfunc10(a: Int, b: Int): Int = a * b

fun main(){
    mul(10,30, :: myfunc10)
}