package week3

fun multiply(func: (Int, Int) -> Int): Int{
    return func(2,3)
}

fun myFunc(x: Int, y:Int): Int = x * y

fun main(){
    val result = multiply(::myFunc)
    println(result)
}