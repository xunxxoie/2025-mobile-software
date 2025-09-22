package week2.hw

fun main(){
    val n = readln().toInt()
    for(i in 2..n){
        if (isPrime(i))
            println(i)
    }
}

fun isPrime(n: Int): Boolean{
    if(n == 2) // 엣지케이스 2가 입력으로 들어오면 소수이므로 true 반환
        return true

    for(i in 2 .. n-1)
        if(n % i == 0) // 나눠 떨어지는게 하나라도 있으면 소수가 아니므로 false 반환
            return false
    return true // 나눠 떨어지는게 하나도 없으므로 true 반환
}