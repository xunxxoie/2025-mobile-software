package week2

enum class Color{
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main(){
    println(getWarmth(Color.BLUE))
    println(getWarmth(Color.RED))
}

fun getWarmth(color: Color): String{
    return when(color){
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        else -> {
            "Not a defined Color"
        }
    }
}