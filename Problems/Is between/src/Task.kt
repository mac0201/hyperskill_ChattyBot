import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()

    val result = one in two..three || one in three..two
    println(result)
}