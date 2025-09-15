package week2

class Point(val x: Int, val y: Int)

operator fun Point.times(p:Point): Point {
    return Point(this.x * p.x, this.y * p.y)
}

fun main(){
    val p1 = Point(10, 20)
    val p2 = Point(2, 3)

    val p3 = p1 * p2
    println("${p3.x}, ${p3.y}")

    val p4 = p1 * p2
    println("${p4.x}, ${p4.y}")

}