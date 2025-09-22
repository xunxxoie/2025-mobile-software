package week3

class Student{
    fun hasPassed(score: Int): Boolean{
        return score > 60
    }
}

fun Student.isScholar(score: Int): Boolean{
    return score > 95
}

fun main(){
    var student = Student()
    println("Pass status: " + student.hasPassed(78))
    println("Pass status: " + student.hasPassed(100))
}