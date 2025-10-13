package week5

enum class RainbowColor{
    Red,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET
}

fun main(){
    println(RainbowColor.valueOf("VIOLET").ordinal)
    println(RainbowColor.VIOLET.name)
}