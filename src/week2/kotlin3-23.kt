package week2

fun main(){
    val arr = arrayOf(1,2,3,4,5)

    var i = 0
    myLabel@while (i < arr.size){
        val item = arr[i++]
        if(item % 5 == 0)
            continue@myLabel

        println("item is $item")
    }
}