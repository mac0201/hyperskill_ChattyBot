import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (a == b && a == c) {
        a
    } else if (a > b && a > c) {
        a
    } else if (a < b && b > c) {
        b
    } else {
        c
    })
}