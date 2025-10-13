package week5

data class Person4(var name: String = "", var age: Int = 0)

fun main(){
    val kim = Person4()

    with(kim){
        name = "KKim"
        age = 30
    }

    println("name = ${kim.name}, age = ${kim.age}")
}