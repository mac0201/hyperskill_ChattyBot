import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()

    val result = first in second..third && second < third
    println(result)
}
