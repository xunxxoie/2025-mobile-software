package week2

fun main(){
    val arr = arrayOf(1, 4, 9, 12, 15)
    var sumEven = 0
    var sumOdd = 0

    for(i in arr){
        if(i%2 == 0) sumEven+=i
        else sumOdd+=i
    }

    println(arr.contentToString())
    println("cumulative sum of even number: $sumEven")
    println("cumulative sum of odd number: $sumOdd")

}

