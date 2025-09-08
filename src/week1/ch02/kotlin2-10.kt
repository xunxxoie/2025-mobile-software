package week1.ch02

fun main(){
    var foo = "My First Kotlin"

    val size = foo.length

    for(i in 0 until size){
        println(foo[i])
    }

    println("first char = ${foo[0]}" + " last char = ${foo[size - 1]}")
    println("first char = ${foo.first()}" + " last char = ${foo.last()}")
    println("${foo.get(0)}")

    var x = "hello world"
    var y = x.substring(0,6) + "world"

    println(x)
    println(y)

    println(x == y)
    println(x === y) // 왜 다른가
}