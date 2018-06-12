package main.kotlin.jun18._11

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
1.     1
2.     11
3.     21
4.     1211
5.     111221
 */
fun countAndSay(n: Int): String {
    if (n == 1) {
        return "1"
    }
    var cycleCount = n
    var next = "11"
    while (cycleCount > 2) {
        var count = 1
        val result = StringBuilder()
        for (i in 1 until next.length) {
            if (next[i] == next[i - 1]) {
                count++
            } else {
                result.append(count).append(next[i - 1])
                count = 1
            }
        }
        result.append(count).append(next[next.lastIndex])
        next = result.toString()
        cycleCount--
    }
    return next
}

fun main(args: Array<String>) {
    println(countAndSay(6))

}