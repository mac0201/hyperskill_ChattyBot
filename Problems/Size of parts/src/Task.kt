import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(number) {
        val part = scanner.nextInt()
        if (part == 0) perfect++
        if (part > 0) larger++
        if (part < 0) smaller++
    }
    println("$perfect $larger $smaller")
}
