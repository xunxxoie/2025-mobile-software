package week5

class MyCounter{
    companion object Counter{
        var countOps: Int = 0

        fun getCount(): Int{
            return countOps
        }
    }
    fun increment(){
        countOps++
    }
}

fun main(){
    val myCounter = MyCounter()
    myCounter.increment()
    println(MyCounter.getCount());
}