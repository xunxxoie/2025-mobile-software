package week2

fun main(){
    val rangeAToF: CharRange = 'a' .. 'f'
    for(c in rangeAToF){
        val code = c.code
        val binary = Integer.toBinaryString(code)
        println("$c = $code, $binary")
    }

    for(c in 'f' downTo 'a'){
        val code = c.code
        val binary = Integer.toBinaryString(code)
        println("$c = $code, $binary")
    }
}