package main.kotlin.june18._1

import kotlin.math.abs

fun reverse(x: Int): Int {
    var target = abs(x.toLong())
    var result = 0L
    while (target != 0L) {
        result = result * 10 + target % 10
        target /= 10
        if (result > Int.MAX_VALUE) return 0
    }
    return if (x > 0) result.toInt() else -result.toInt()
}

fun main(args: Array<String>) {
    println("result:${reverse(1534236469)}")
}