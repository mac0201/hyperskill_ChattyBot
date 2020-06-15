import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    var count = 1
    val start = scanner.nextInt()
    var last = 0

    repeat(size - 1) {
        val number = scanner.nextInt()
        if (number > last && number > start) count++
        last = number
    }
    println(if (count == size) "YES" else "NO")
}