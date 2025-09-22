package week3

fun main(){
    val add: (Int, Int) -> String = {
            a:Int, b:Int -> "a+b = ${a+b}"
    }
    val sub: (Int, Int) -> String = {
            a:Int, b:Int -> "a-b = ${a-b}"
    }

    addOrSub4(10,20,add)
    addOrSub4(10,20,null)

}

fun addOrSub4(x: Int, y: Int, op: ((Int, Int) -> String)?): Unit{
    if(op==null){
        println("function is null")
    }else{
        println(op(x,y))
    }
}