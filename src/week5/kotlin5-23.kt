package week5

data class Name(val oldNickname: String, var newNickname: String)

class Person(val name: String, val age: Int){
    lateinit var nickname: Name

    fun changeNickname(){
        if(::nickname.isInitialized){
            println("My nickname as a kid was ${nickname.oldNickname}")
            println("My friends call me ${nickname.newNickname}")
        }else{
            println("The property nickname is not initialized yet.")
        }
    }
}

fun main(){
    val kim = Person("Kim", 23)
    kim.changeNickname()

    val nickname = Name("Super Sonic", "Squirrel")
    kim.nickname = nickname
    kim.changeNickname()
}