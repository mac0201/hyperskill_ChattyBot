import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val begin = scanner.nextInt()
    val end = scanner.nextInt()

    for (i in begin..end) {
        println(if (i % 3 == 0 && i % 5 != 0) {
            "Fizz"
        } else if (i % 5 == 0 && i % 3 != 0) {
            "Buzz"
        } else if (i % 5 == 0 && i % 3 == 0) {
            "FizzBuzz"
        } else {
            i
        })
    }
}