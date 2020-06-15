import java.util.*

// write your code here

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()

    fun divide(a: Long, b: Long): Double {
        return a / b.toDouble()
    } 
    println(divide(a, b))
}
