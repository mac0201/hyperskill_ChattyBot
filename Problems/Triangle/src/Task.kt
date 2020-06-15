import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()

    println(if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) "YES" else "NO")
}