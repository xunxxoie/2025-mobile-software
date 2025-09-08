package week1.hw

fun main() {
    val s1 = "12x"
    var s2 = ""
    var radix = ""

    /**
     * (1) NumberFormatException 발생
     * (2) "12x"를  Int 타입으로 캐스팅하려고 하는데 형식에 맞지 않는 인자가 전달되었기 때문
     * (3) 주어진 String의 마지막에 radix를 나타내는 값이 있다는 가정하에, 숫자만 따로 문자열에 저장해두고 radix에 맞게 변환하는 방식으로 수정
     */
    for(i in 0 until s1.length) {
        if(i == s1.length - 1) {
            radix = s1[i].toString()
        }else {
            s2 += s1[i]
        }
    }

    if(radix.equals("x")){
        println(s2.toInt(16))
    } else if(radix.equals("b")){
        println(s2.toInt(2))
    } else if(radix.equals("o")){
        println(s2.toInt(8))
    } else if(radix.equals("d")){
        println(s2.toInt(10))
    } else {
        println(s2.toInt())
    }
}