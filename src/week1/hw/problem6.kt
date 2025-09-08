package week1.hw

fun main() {
    println(fruit("Apple", "Malus domestica", 48)); // (1) 아래 삼중 따옴표로 감싼 값들에 매개변수로 넘겨준 값이 대입되어 출력
}

fun fruit(name: String, sciName: String, calories: Int) = """
{
    name: $name,
    scientific name : $sciName,
    calories : $calories
}
"""
// (2) 만들어진 String을 반환