package week5

fun main(){
    val word: String = "kotlin"

    val upperLetter = word.run{
        print("Converting $this to uppercase is ")
        uppercase()
    }

    println("$upperLetter")
}