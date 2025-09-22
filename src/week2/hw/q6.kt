package week2.hw

class Fraction(val x: Int, val y: Int)

operator fun Fraction.plus(f: Fraction): Fraction {

    val gcd = gcd1(this.y, f.y) // 최대 공약수 계산

    return Fraction(this.x * f.y + y * this.x, gcd) // 자신의 분자 * 입력의 분모 + 입력의 분자 * 자신의 분모 / 최대공약수
}

fun gcd1(num1: Int, num2: Int): Int{
    var a = num1; var b = num2

    while(b != 0){
        val temp = b
        b = a % b
        a = temp
    }

    return a
}