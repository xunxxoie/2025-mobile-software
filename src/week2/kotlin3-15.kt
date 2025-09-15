package week2

fun main(){
    val rangeAToF: CharRange = 'a'..'f'
    val range2: CharRange = 'a'.rangeTo('f')
    val range3: CharRange = 'a'.until('g')

    for(c in rangeAToF){
        println("$c = ${c.code}")
    }

    for(c in range2){
        println("$c = ${c.code}")
    }

    for(c in range3){
        println("$c = ${c.code}")
    }

}