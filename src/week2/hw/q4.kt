package week2.hw

fun main(){

    var x = 6

    while(x != 1){
        if(x % 2 == 0){ // 짝수면 x = x / 2
            x = x / 2
        }else{          // 홀수면 x = 3 * x + 1
            x = 3 * x + 1
        }
        println(x)
    }
}