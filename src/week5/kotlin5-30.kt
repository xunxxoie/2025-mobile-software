package week5

class Person10(var name: String, var age: Int)

fun main(){
    val kim = Person10("kim", 10)
    val hong = kim
    println(kim == hong)

    kim.name = "Park"
    println(hong.name)

}