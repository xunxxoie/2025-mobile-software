package week3

fun multiply(a: Int, b: Int, func:((Int, Int) ->Int)?):Int{
    if(func == null)
        return -1
    return func(a,b)
}

fun myfunc3(a: Int, b: Int): Int = a * b

fun main(){
    val result1 = multiply(3,2, ::myfunc3)
    println(result1)

    val result2 = multiply(3,2, null)
    println(result2)
}
