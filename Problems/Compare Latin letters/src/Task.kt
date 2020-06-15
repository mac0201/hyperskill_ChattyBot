import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val first = scanner.next().first().toLowerCase()
    val second = scanner.next().first().toLowerCase()

    val result = first == second

    println(result)
}