package week1.hw

fun main() {
    var name: String? = null

    println(name?.length) // (1)

    // (2)
    val result = if(name == null){
        println(-1)
    }else{
        println(name.length);
    }
}