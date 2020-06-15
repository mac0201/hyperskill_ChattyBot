import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

/*    var count = 0

    val start = scanner.nextInt()
    val next = 0
    var last = 0


    // if number >= nextNum count++
    repeat(size) {
        val nextNum = scanner.nextInt()
        if (nextNum >= start) last = nextNum
        //last = nextNum
        if (last <= nextNum) count++
    }

    println(count)*/

/*
    val size = scanner.nextInt()
    val numbers = ArrayList<Int>()
    val counts = ArrayList<Int>()
    var currentCount = 0

    var number = scanner.nextInt()
    repeat(size) {

        val nextNum = scanner.nextInt()
        //if (nextNum >= number) println("$nextNum >= $number") else println("not greater")
        if (nextNum >= number) {
            currentCount++
        } else {
            counts.add(currentCount)
            currentCount = 0
        }

        number = nextNum
        // numbers.add(scanner.nextInt())
    }
    println(counts)*/

/*

    repeat(size) {
        numbers.add(scanner.nextInt())
    }
    val iterator = numbers.iterator()

    for (n in numbers) {
        while(numbers[n] < numbers[size - 1]) {
            println("$n  and next is ${n+1}")
        }
    }*/



/*    while(iterator.hasNext()) {
        println(iterator. iterator.next())
    }*/

   /*
    for (number in numbers) {
        //println(number)
*//*        if (numbers[number] > numbers[number - 1] ) {
            println("${numbers[number]} > ${numbers[number - 1]}")
            println("currentCount++")
            println()
        } else if (numbers[number] == numbers[number - 1]) {
            println("${numbers[number]} == ${numbers[number - 1]}")
            println("currentCount++")
            println()
        }
        else if (numbers[number - 1] > numbers[number]) {
            println("${numbers[number]} < ${numbers[number - 1]}")
            println("currentCount = 0")
            println()
        }*//*

*//*        if (numbers[number+1] > numbers[number]) println("next is MORE\n")
        if (numbers[number + 1] == numbers[number]) println("next is SAME\n")
        if (numbers[number + 1] < numbers[number]) println("next is LESS\n")*//*
        println(numbers.indexOf(number))



    }*/











    //counts.forEach { println(it) }
    //println(counts)
   // numbers.forEach { if(it == 4) println("HAHAHA $it") else println("NO FOU") }

   // println(if (numbers[3] >= numbers[4]) "${numbers[3]} is bigger or equal to ${numbers[4]}" else "it's not")

/*    for (number in numbers) {
        if (number >= numbers[number + 1]) {
            println("bigger")
        }
        else {
            println("smaller")
        }
    }*/

    //println(numbers[4])
/*
    val start = scanner.nextInt()
    for (i in numbers) {
        println(i)
        if (numbers[i] >= numbers[i - 1]) {
            println("$i is greater or equal to ${i - 1}")
        }
        else {
            println("$i is smaller than ${i - 1}")
        }*/

        /*if (numbers[i] <= numbers[i + 1]) {
            currentCount++
            counts.add(currentCount)
        }
        else {
            currentCount = 0
        }*/
    //}

/*    for (i in counts) {
        println(i)
    }*/


    /*
        size = scanner

        repeat (size) {

            number = scanner

            lastnumber = number

            if (lastnumber <= number) count++ else counts.add(count) && count = 0

     */

    /*
    ------------------------------------------------------------------------------------------------
     */


    val size = scanner.nextInt()
/*    var last = 0

   // val start = scanner.nextInt()
    var currentCount = 1
    val counts = ArrayList<Int>()

    val start = scanner.nextInt()
    if (start != 0) {
        repeat(size - 1) {
            val number = scanner.nextInt()
            if (last <= number && number >= start) {
                currentCount++
            } else {
                counts.add(currentCount)
                currentCount = 1
            }
            //if (last <= number) println("next is bigger") else println("next is smaller")

            //println(number)
            last = number
        }
    }
    println(counts.max())*/

    val numbers = ArrayList<Int>()

    repeat(size) {
        numbers.add(scanner.nextInt())
    }


        for (i in numbers) {
            if (numbers.first() != 0) {
                for (numbers.) {
                    println("bigger")
                }
            }
        }



    println(numbers)



}