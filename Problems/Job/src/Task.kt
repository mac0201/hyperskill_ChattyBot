import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val age = scanner.nextInt()
    val result = age in 18..59
    println(result)
}