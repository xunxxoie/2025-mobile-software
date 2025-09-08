package week1.ch02

fun main(){
    var str1: String? = null
    var str2: String = "joonseo"

    println(emptyCheck(str1))
    println(emptyCheck(str2))

}

fun emptyCheck(s: String?) : Boolean{
    if(s == null) return true
    return false
}