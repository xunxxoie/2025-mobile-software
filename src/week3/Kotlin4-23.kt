package week3

fun check(a: Int, even: (Int) -> Boolean): Boolean{
    return even(a)
}

fun main(){
    val result: Boolean = check(10, {it % 2 == 0})
    println(result)
}