package week5

object Button{
    var clicked = 0
    fun onClick(){
        clicked++
    }
}

fun main(){
    Button.onClick()
    print("number of times = ${Button.clicked}")
    Button.onClick()
    Button.onClick()
    print("number of times = ${Button.clicked}")
}