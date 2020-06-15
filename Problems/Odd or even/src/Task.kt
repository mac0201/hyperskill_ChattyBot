import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number = scanner.nextInt()
    val result = if (number % 2 == 0) "EVEN" else "ODD"
    println(result)
}