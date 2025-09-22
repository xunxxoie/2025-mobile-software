package week3

fun main(){
    addOrSub2(10, 20, ::add)
}

fun addOrSub2(a: Int, b: Int, op:(Int, Int) -> String){
    println(op(a,b))
}

fun add (a: Int, b: Int):String = "$a + $b = ${a+b}"
fun sub (a: Int, b: Int):String = "$a - $b = ${a-b}"
