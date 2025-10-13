package week5

class Person1(val name: String, var age: Int){
    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}

fun main(){
    val kim = Person1("Kim", 18)
    println(kim)
}