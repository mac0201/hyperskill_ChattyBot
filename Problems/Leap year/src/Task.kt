import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val year = scanner.nextInt()
    val result = if (year % 4 != 0) {
        "Regular"
    } else if (year % 100 != 0) {
        "Leap"
    } else if (year % 400 != 0) {
        "Regular"
    } else {
        "Leap"
    }

    println(result)
}
