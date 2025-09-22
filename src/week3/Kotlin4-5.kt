package week3

fun main(){
    val largerValue = max(10, 20)
    println(largerValue)
}

fun max(a: Int, b: Int): Int
    = if(a>b){
        println("$a is greater than $b")
        a
    }else{
        println("$b is greater than $b")
        b
        98
    }