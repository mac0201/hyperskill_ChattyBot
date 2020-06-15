import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val x = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(x) {
        val grade = scanner.nextInt()
        if (grade == 2) d++
        if (grade == 3) c++
        if (grade == 4) b++
        if (grade == 5) a++
    }
    println("$d $c $b $a")
}