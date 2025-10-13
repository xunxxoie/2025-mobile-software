package week5

data class Fruit(var name: String, var sciName: String, var calories: String)

fun main(){
    val apple1 = Fruit(
        "Apple",
        "학명: Malus domestica",
        "100g당 칼로리: 48kcal"
    )

    val apple2 = Fruit(
        "Apple",
        "학명: Malus domestica",
        "100g당 칼로리: 48kcal"
    )

    println(apple1.hashCode())
    println(apple2.hashCode())
    println(apple1 == apple2)

}