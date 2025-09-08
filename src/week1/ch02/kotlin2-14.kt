package week1.ch02

fun main(){

    var str0: String? = "hihi"
    var str1: String? = "hello"
    var str2: String? = null
    println(str1?.length)
    println(str2?.length)

    val str3 =  if(str2 == null){ // Elvis 연산자
        str0
    }else{
        str1
    }

    println(str3)

    str2?.let{
        println(it)
    } // let은 null이 아니면 실행
}