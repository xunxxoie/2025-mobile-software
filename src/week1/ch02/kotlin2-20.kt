package week1.ch02

fun main(){
    try{
        throw ClassNotFoundException("I occur Exception GG")
    }catch (e: ClassNotFoundException){
        println(e.message)
    }finally {
        print("end of print")
    }
}