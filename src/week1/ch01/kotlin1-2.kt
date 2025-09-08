package week1.ch01

fun main(){

    // val = 값을 변경할 수 없음, 읽기 전용
    // var = 값을 변경할 수 있음, 읽기 쓰기 가능

    val intValue: Int = 123
    val doubleValue: Double = 12.3

    val myName: String = "Hong"
    var myFriend = "Kim"
    myFriend = "Lee"

    showMessage(myName)
    showMessage(myFriend)
}
