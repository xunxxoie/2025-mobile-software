package week2.hw

fun main(){
    println(lastChar("Kotlin"))
    println(lastChar(null))

}

fun lastChar(s: String?):Char{
    if(s == null)
        return '-'
    return s[s.lastIndex]
}