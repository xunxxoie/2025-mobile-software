package week5

enum class DayOfWeek(val isWeekday: Boolean){
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    fun typeOfDay() = if (isWeekday) "Weekday" else "Weekend"
}

fun main(){
    for(day in DayOfWeek.values()){
        println("${day.name}: ${day.typeOfDay()}")
    }
}
