import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val length = scanner.nextInt()
    var count = 0
    repeat(length) {
        val number = scanner.nextInt()
        if (number > 0) count++
    }
    println(count)
}