import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.next().first()
    val b = scanner.next().first()
    val c = scanner.next().first()

    val result = b == a + 1 && c == a + 2

    println(result)
}