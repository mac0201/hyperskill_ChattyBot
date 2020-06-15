import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()

    val result = one > 0 && two <= 0 && three <= 0 || 
        one <= 0 && two > 0 && three <= 0 || 
        one <= 0 && two <= 0 && three > 0
    println(result)
}
