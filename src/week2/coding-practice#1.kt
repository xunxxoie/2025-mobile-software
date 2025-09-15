package week2


fun main(){
    print("Enter the score:")
    val score = readln().toInt()
    var grade1 = gradeWithIfStatement(score)
    var grade2 = gradeWithIfExpression(score)

    print("grade1 = $grade1, grade2 = $grade2")
}

fun gradeWithIfStatement(num: Int) : Char{
    if (num in 90 .. 100){
        return 'A'
    }else if (num in 80..89){
        return 'B'
    }else if (num in 70..79){
        return 'C'
    }else if (num in 60..69){
        return 'D'
    }else{
        return 'F'
    }
}

fun gradeWithIfExpression(num: Int) : Char{
    val grade = if (num in 90 .. 100){
        'A'
    }else if (num in 80..89){
        'B'
    }else if (num in 70..79){
        'C'
    }else if (num in 60..69){
        'D'
    }else{
        'F'
    }

    return grade
}