package week2

fun main(){
    val num1 = 12; val num2 = 18
    val gcdValue = gcd(num1, num2)
    val lcmValue = (num1 * num2) / gcdValue

    println("The GCD of $num1 and $num2 is $gcdValue")
    println("The LCM of $num1 and $num2 is $lcmValue")

}

fun gcd(num1: Int, num2: Int): Int{
    var a = num1; var b = num2

    while(b != 0){
        val temp = b
        b = a % b
        a = temp
    }

    return a
}