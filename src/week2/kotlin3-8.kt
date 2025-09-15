package week2

fun main(){
    val a = 9
    val b = 8

    val max = if(a>b){
        println("$a > $b")
        a
    }else if(a == b){
        println("$a == $b")
        a
    }else{
        println("$a < $b")
        b
    }

    println("A large value is $max")
}