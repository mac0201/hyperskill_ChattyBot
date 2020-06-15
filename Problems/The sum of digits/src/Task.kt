import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    val first = number / 100
    val second = number % 100 / 10
    val third = number % 10
    val result = first + second + third
    println(result)
}
