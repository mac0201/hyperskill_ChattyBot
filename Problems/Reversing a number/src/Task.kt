import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var number = scanner.next().reversed()

/*
    var number = scanner.nextInt()
    var toStr = number.toString()
    var reverse = String

    while (number != 0) {
        reverse = reverse * 10 + number % 10
        number /= 10
    }*/
    println(number)
}