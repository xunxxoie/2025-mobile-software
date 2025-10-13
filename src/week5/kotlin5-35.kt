package week5

class Person3(var name:String, var age: Int)

fun main(){
    val park = Person3("Park", 25)
    park.also {
        println(it.name)
        println(it.age)
    }
}