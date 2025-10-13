package week5

sealed class SealedBase{
    class ChildA: SealedBase()
    class ChildB: SealedBase()
}

class OtherClass(): SealedBase()

fun main() {
    val instanceA = SealedBase.ChildA()
    checkType(instanceA)
    val other = OtherClass()
    checkType(other)
}

fun checkType(obj: SealedBase) {
    when(obj){
        is SealedBase.ChildA -> println("ChildA is ChildA")
        is SealedBase.ChildB -> println("ChildB is ChildA")
        is OtherClass -> println("OtherClass is OtherClass")
    }
}