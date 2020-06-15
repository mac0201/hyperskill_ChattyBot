import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    var sum = 0

    for (i in start..end) {
        sum += i
    }
    println(sum)
}