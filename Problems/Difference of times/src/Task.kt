import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val hour1 = scanner.nextInt()
    val minute1 = scanner.nextInt()
    val second1 = scanner.nextInt()

    val hour2 = scanner.nextInt()
    val minute2 = scanner.nextInt()
    val second2 = scanner.nextInt()

    val result1 = hour1 * 3600 + minute1 * 60 + second1
    val result2 = hour2 * 3600 + minute2 * 60 + second2
    val result = result2 - result1
    println(result)
}
