package week2.hw

fun fooWithLabel(target: Int){
    var found = false
    outer@ for(i in 3..7){
        for(j in 11..15){
            if(i * j == target){ // 만약 이 지점에서 target == i*j를 만족하는 각각을 찾으면 아래 if 문이 실행
                println("Found at ($i, $j)")
                found = true
                break@outer // 첫번째 반복문에서 out되고 함수 종료
            }
        }
    }
    if(!found) println("not found")
}

fun main(){
    fooWithLabel(45)
    fooWithLabel(120)
}