import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var room1 = scanner.nextInt()
    var room2 = scanner.nextInt()
    var room3 = scanner.nextInt()

    room1 = if (room1 % 2 == 1) room1 + 1 else room1
    room2 = if (room2 % 2 == 1) room2 + 1 else room2
    room3 = if (room3 % 2 == 1) room3 + 1 else room3

    val desks = (room1 + room2 + room3) / 2

    println(desks)
}