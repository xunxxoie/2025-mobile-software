package week5

class NeedBigMemory{
    init {
        println("Heavy Resource Initialized")
    }
}

class MyResource{
    val bigMemory: NeedBigMemory by lazy{
        NeedBigMemory()
    }
}

fun main(){
    val resource = MyResource()
    println("Not Initialized")
    resource.bigMemory
}