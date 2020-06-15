import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    var newNumber = 0

    newNumber = if (number % 2 == 0) number + 2 else number + 1
    println(newNumber)
}