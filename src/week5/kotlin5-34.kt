package week5

class Person2(var name:String="", var age:Int=0)

fun main(){
    val kim: Person2 = Person2().apply {
        name = "Kim"
        age = 25
    }
    val lee: Person2 = kim.apply {
        name = "Lee"
        age = 25
    }
    println("${kim.name} is ${kim.age}")
    println("${lee.name} is ${lee.age}")
}