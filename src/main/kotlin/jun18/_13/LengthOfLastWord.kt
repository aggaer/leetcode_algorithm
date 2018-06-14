package main.kotlin.jun18._13

/**
 *
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * @param s String
 * @return Int
 */
fun lengthOfLastWord(s: String): Int {
    var count = 0
    for (i in s.length - 1 downTo 0) {
        if (s[i] != ' ') {
            count++
        } else {
            if (i != s.length - 1 && s[i + 1] != ' ') return count else count = 0
        }
    }
    return count
}

fun main(args: Array<String>) {
    println(lengthOfLastWord("   b  "))
}