@file:Suppress("unused")

package main.kotlin.jun18._14

/**
给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。
 */

//最优算法
fun plusOne(digits: IntArray): IntArray {
    var base: Int
    var exp = 0
    (digits.lastIndex downTo 1).forEach {
        base = when (it) {
            digits.lastIndex -> digits.last() + 1
            else -> digits[it] + exp
        }
        digits[it] = base % 10
        exp = base / 10
    }
    base = digits[0] + exp + if (digits.size == 1) 1 else 0
    digits[0] = base % 10
    return when (base / 10) {
        1 -> mutableListOf<Int>().apply {
            add(1)
            digits.forEach { add(it) }
        }.toIntArray()
        else -> digits
    }
}

fun main(args: Array<String>) {
    plusOne(intArrayOf(8, 9, 9, 9)).forEach { print(it) }
}

//我的算法
fun plusOneAlter(digits: IntArray): IntArray {
    val carryOne = { x: MutableList<Int> ->
        x[0] = 1
        x.add(0)
        x.toIntArray()
    }
    if (digits.size == 1) return if (digits[0] == 9) intArrayOf(1,0) else intArrayOf(digits[0] + 1)
    var needCarry = digits.last() == 9

    for (i in digits.lastIndex downTo 1) {
        if (needCarry) {
            digits[i] = 0
            //            if (i == 0) return carryOne.invoke(digits.toMutableList())
            if (digits[i - 1] == 9) {
                digits[i - 1] = 0
                needCarry = true
            } else {
                digits[i - 1] = digits[i - 1] + 1
                needCarry = false
            }
        } else {
            if (i == digits.lastIndex) digits[i] += 1
            needCarry = false
        }
    }
    if (needCarry) return carryOne.invoke(digits.toMutableList())
    return digits
}