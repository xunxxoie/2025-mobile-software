package week3

fun accSum(vararg lint: Int){
    var sum = 0
    for(element in lint){
        sum += element
    }
    println(sum)
}

fun main(){
    accSum(1,2,3)
    accSum(1,2,3,4,5)

}