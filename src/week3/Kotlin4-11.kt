package week3

fun multiply(a: Int, b: Int, func: (Int, Int) -> Int):Int{
    return func(a,b)
}

fun myfunc2(p: Int, q: Int):Int = p*q

fun main(){
    val result = multiply(1,2, ::myfunc2)
    println(result)
}