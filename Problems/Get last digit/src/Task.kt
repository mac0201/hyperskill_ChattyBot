import java.util.*
import kotlin.math.abs

// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()

    fun getLastDigit(a: Int) = abs(a) % 10

    println(getLastDigit(a))
}