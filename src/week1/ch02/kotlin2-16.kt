package week1.ch02

fun main() {
    var str: String = "blackpink"
    if(str is String){
        println(str)
    }else{
        println("wrong type")
    }
}