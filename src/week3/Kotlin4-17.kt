package week3

val add = {a: Int, b: Int -> a + b}
val sub = {a: Int, b: Int -> a - b}

fun addOrSub(flag: Boolean): (Int, Int) -> Int{
    if(flag){
        return add
    }else{
        return sub
    }
}

fun main(){
    val result = addOrSub(true)
    println(result(1,2))
}
