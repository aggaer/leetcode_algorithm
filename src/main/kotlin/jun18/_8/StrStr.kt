package main.kotlin.jun18._8

/**
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Input: haystack = "hello", needle = "ll"
Output: 2

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */
fun strStr(haystack: String, needle: String): Int {
    if (haystack.isEmpty() && needle.isEmpty()) return 0
    var start = 0
    val extends = needle.length
    while ((start + extends) < haystack.length) {
        if (haystack.substring(start, start + extends) == needle) return start
        start++
    }
    return -1
}

fun main(args: Array<String>) {
    println(strStr("aaaaa", "bba"))
}