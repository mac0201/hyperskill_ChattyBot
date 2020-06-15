import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotelCost = scanner.nextInt()

    val result = duration * foodCost + flightCost * 2 + duration * hotelCost - hotelCost
    println(result)
}
