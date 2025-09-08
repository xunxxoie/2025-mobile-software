package week1.hw

fun main() {
    // 예상 결과: 128
    // 이유: Byte.MAX_VALUE(127)가 산술 연산 시 Int로 승격되어 127 + 1 = 128이 됨.
    println(Byte.MAX_VALUE + 1)
    
    // 예상 결과: 32768
    // 이유: Short.MAX_VALUE(32767)가 산술 연산 시 Int로 승격되어 32767 + 1 = 32768이 됨.
    println(Short.MAX_VALUE + 1)
    
    // 예상 결과: -2147483648
    // 이유: Int.MAX_VALUE는 2147483647이고, 2147483647 + 1 = 2147483648인데 Int 범위는 -2147483648~2147483647이므로 오버플로우가 발생하여 -2147483648이 됨
    println(Int.MAX_VALUE + 1)
    
    // 예상 결과: 2147483648
    // 이유: Int.MAX_VALUE + 1L에서 1L은 Long 타입이므로 Int.MAX_VALUE가 Long으로 타입 변환되어 계산됨.
    println(Int.MAX_VALUE + 1L)
}