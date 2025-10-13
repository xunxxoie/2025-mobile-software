package week5

import java.util.Locale.getDefault

fun main(){
    val word: String? = "Kotlin"

    word?.let {
        println(it)
        println(it.length)
        println(it.uppercase(getDefault()))
        println(it.lowercase(getDefault()))
        println(it.reversed())
    }
}