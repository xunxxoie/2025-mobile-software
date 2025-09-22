package week2.hw

import java.text.DecimalFormat

fun main() {
    val weight = readLine()?.toDouble()

    val heightCm = readLine()?.toDouble()

    if (weight == null || heightCm == null)
        return

    val height = heightCm / 100.0  // cm를 m로 변환
    val bmi = weight / (height * height) // bmi 계산
    val df = DecimalFormat("#.##")

    val category = when { // bmi에 따른 계산
        bmi < 18.5 -> "저체중"
        bmi < 23.0 -> "정상"
        bmi < 25.0 -> "과체중"
        bmi in 25.0..29.9 -> "1단계 비만"
        bmi in 30.0..34.9 -> "2단계 비만"
        bmi >= 35.0 -> "고도비만"
        else -> "알 수 없음"
    }

    println("BMI: ${df.format(bmi)} ($category)")
}
