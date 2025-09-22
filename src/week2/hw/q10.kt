package week2.hw

enum class MallInfo(val opens: Int, val closes: Int) {
    HYUNDAI(10,20),
    LOTTE(11, 21),
    SHINSEGYE(9, 19)
}

fun main(){
    println(isOperatingHours(MallInfo.LOTTE, 9))
    println(isOperatingHours(MallInfo.HYUNDAI, 21))
}

fun isOperatingHours(mall: MallInfo, h: Int): Boolean {
    return h in mall.opens .. mall.closes // 들어오는 타입에 맞게 open< h <closes로 검사
}