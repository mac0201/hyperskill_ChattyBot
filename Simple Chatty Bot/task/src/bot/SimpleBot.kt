package bot

import java.util.*


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Aid", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")

    val answers = listOf<String>("To repeat a statement multiple times.",
            "To decompose a program into several small subroutines.",
            "To determine the execution time of a program.",
            "To interrupt the execution of a program.")

    var i = 1
    var correct = false

    println("Why do we use methods?")

    for (answer in answers) {
        println("$i. $answer")
        i++
    }

    do {
        val answer = scanner.nextInt()
        if (answer == 2) {
            correct = true
        } else {
            println("Please, try again.")
        }
    } while (!correct)
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
