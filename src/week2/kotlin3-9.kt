package week2

import kotlin.random.Random

fun guessValue(x : Int){
    when(x){
        1 -> println("$x is 1")
        2 -> println("$x is 2")
        3, 4 -> println("$x is 3 or 4")
        else -> {
            println("$x is greater than or equal to 5")
        }
    }
}

fun main(){
    var randomInt = Random.nextInt(1, 10)
    guessValue(randomInt)
}