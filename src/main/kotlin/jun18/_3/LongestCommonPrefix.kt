package main.kotlin.june18._3

/**
 *
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
 */
fun longestCommonPrefix(strs: Array<String>): String {
    val length = strs.size
    if (length == 0) return ""
    if (length == 1) return strs[0]
    val minDigit = strs.toList().minBy { it.length }.orEmpty().length
    var resultLength = 1
    while (resultLength <= minDigit) {
        for (i in 0 until length - 1) {
            if (strs[i].substring(0, resultLength) != strs[i + 1].substring(0, resultLength)) return strs[0].substring(0, resultLength - 1)
        }
        resultLength++
    }
    return strs[0].substring(0, resultLength - 1)
}

fun main(args: Array<String>) {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
}