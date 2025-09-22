package week2.hw

fun main(){
    val s = readLine()

    if(s == null)
        return

    var sum = 0
    for(i in s){
        sum += i.digitToInt() // digitToInt를 활용해 각 자릿수를 더함
    }

    println(sum)
}