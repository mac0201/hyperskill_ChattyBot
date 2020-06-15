import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    val box1 = (x1 * x1) + (y1 * y1) + (z1 * z1)
    val box2 = (x2 * x2) + (y2 * y2) + (z2 * z2)

    if (box1 == box2) {
        println("Box 1 = Box 2")
    }
    else if (box1 < box2) {
        println("Box 1 < Box 2")
    }
    else if (box1 > box2) {
        println("Box 1 > Box 2")
    }
    else if (box1 != box2) {
        "Incomparable"
    }

/*
    var result = ""

    result = if (box1 > box2) {
        "Box 1 > Box 2"
    } else if (box1 < box2) {
        "Box 1 < Box 2"
    } else if (box1 == box2) {
        "Box 1 = Box 2"
    } else {
        "Incomparable"
    }

    println(result)
*/











/*
    // width = x ,  height = y  ,  length = z
    val box1 = (2 * z1 * x1) + (2 * z1 * y1) + (2 * x1 * y1)
    val box2 = (2 * z2 * x2) + (2 * z2 * y2) + (2 * x2 * y2)

   // println("Box 1 area: $box1,  Box2 area: $box2")
    var result = ""

   result = if (box1 > box2) {
        "Box 1 > Box 2"
    } else if (box1 < box2) {
        "Box 1 < Box 2"
    } else if (box1 == box2) {
        "Box 1 = Box 2"
    } else {
        "Incomparable"
    }

    println(result)*/





}