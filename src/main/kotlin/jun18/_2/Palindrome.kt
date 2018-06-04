package main.kotlin.june18._2

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    val reversedStr = str.reversed().takeIf { !str.contains("-") } ?: return false
    return reversedStr == str
}

fun main(args: Array<String>) {
    println("result:${isPalindrome(121)}")
    println(Integer.toBinaryString(0))
}