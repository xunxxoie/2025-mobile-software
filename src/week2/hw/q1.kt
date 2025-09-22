package week2.hw

fun main(){
    println(inStringRange("Kotlin"))
    println(inStringRange("kotlin"))
}

fun inStringRange(s : String) : Boolean {
    return (s in "Java" .. "Scalar")
}

/**
 * 사전이라고 생각하면, "Kotlin"은 범위에 들어가지만, 소문자로 시작하는 kotlin은 포함되지 않기 때문
 */