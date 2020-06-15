import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val nums = Array(5) { scanner.nextInt() }

    val result = nums[4] in nums[0]..nums[1] && nums[4] in nums[2]..nums[3]
    println(result)
}