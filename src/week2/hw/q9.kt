package week2.hw

import jdk.internal.jimage.decompressor.CompressIndexes.readInt

fun main(){
    val age = readLine()?.toInt()
    if(age == null) // null 체크
        return
    print(checkOld(age))
}

fun checkOld(n : Int):String{
    return when(n){ // 입력으로 들어온 값에 맞게 분기
        in 0 .. 12 -> "어린이"
        in 13 .. 17 -> "청소년"
        in 18 .. 64 -> "성인"
        in 65 .. 999 -> "노년"
        else -> {
            "잘못된 입력"
        }
    }
}