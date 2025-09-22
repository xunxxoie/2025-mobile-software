package week2.hw

fun main(){
    for (i in 8 .. 12){
        println(convertHexDigit(i))
    }
}

fun convertHexDigit(n : Int): Char{
    return when(n){ // 각각의 입력에 맞게 반환
        8 -> '8'
        9 -> '9'
        10 -> 'A'
        11 -> 'B'
        12 -> 'C'
        13 -> 'D'
        14 -> 'E'
        15 -> 'F'
        else -> {
            '-'
        }
    }
}