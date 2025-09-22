package week3

/**
 * 순수함수
 * - 같은 파라메터에 대해 항상 같은 값을 반환
 * - 함수 바깥의 어떠한 상태도 변경하지 않음
 *
 * 고차함수(=일급 객체)
 * - 고차함수는 함수의 파라메터로 전달할 수 있다.
 * - 고차함수는 함수의 return 값에 사용할 수 있다.
 * - 고차함수는 변수에 저장할 수 있다.
 */

fun myPureFunc(a: Int, b: Int): Int = a * b

fun main(){
    val funcRef = ::myPureFunc
    val result = funcRef(1,2)
    println("result is $result")
}
