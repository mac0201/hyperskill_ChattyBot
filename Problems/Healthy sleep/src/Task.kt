import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val shouldSleep = scanner.nextInt()
    val oversleep = scanner.nextInt()
    val annSleep = scanner.nextInt()

    val result = if (annSleep in shouldSleep..oversleep) {
        "Normal"
    } else if (annSleep > oversleep) {
        "Excess"
    } else {
        "Deficiency"
    }
    println(result)
}