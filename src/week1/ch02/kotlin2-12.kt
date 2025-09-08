package week1.ch02

fun main(){
    var x = 5
    val y = "a is $x"

    x = 10
    val z = "${y.replace("is", "was")}"
    println(z)

}