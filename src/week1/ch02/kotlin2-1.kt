package week1.ch02

const val PI: Double = 3.141592

fun main(){
    val radius: Double = 10.0
    println(calculateArea(radius))
}

fun calculateArea(radius: Double) : Double{
    return PI * radius * radius
}
