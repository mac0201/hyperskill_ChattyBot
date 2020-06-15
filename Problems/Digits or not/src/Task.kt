import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val chars = Array(4) { scanner.next().first() }
    val a = chars[0].isDigit()
    val b = chars[1].isDigit()
    val c = chars[2].isDigit()
    val d = chars[3].isDigit()

    println("$a\\$b\\$c\\$d")
}