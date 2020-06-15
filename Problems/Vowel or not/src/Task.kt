import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    fun isVowel(l: Char): Boolean {
        val lowercase = l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'
        val uppercase = l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U'

        return lowercase || uppercase
    }

    println(isVowel(letter))
}
