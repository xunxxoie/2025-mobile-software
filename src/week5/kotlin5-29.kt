package week5

data class Pizza(var name: String, val comp: String)

fun main(){
    val pizzaList = listOf<Pizza>(
        Pizza("Potato", "도미노"),
        Pizza("Potato", "피자헛"),
        Pizza("Potato", "파파존스"),
        )

    for(p in pizzaList){
        println("피자: "+p.name +" 헤시:"+p.hashCode())
    }
}