package week3

fun main(){
    val add: (Int, Int) -> String = {
        a:Int, b:Int -> "a+b = ${a+b}"
    }
    val sub: (Int, Int) -> String = {
            a:Int, b:Int -> "a-b = ${a-b}"
    }

    println(addOrSub3(10, 20, add))

}

fun addOrSub3(a:Int, b:Int, f:(Int, Int) -> String): String{
    return f(a,b)
}