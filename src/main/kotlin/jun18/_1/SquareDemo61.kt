package main.kotlin.june18._1

import kotlin.math.abs

/**
 * 计算一个数的平方根：
 * 参数:目标数 num，偏移量offset（误差）
 * 二分法：确定一个初始因子factor，若factor的平方与目标数的差小于offset，则返回结果
 * 否则对factor进行偏差值运算（factor*factor + num）/factor/2，再进行下一次循环
 */
fun square(num: Double, offset: Double): Double {
    if (num <= 0) return 0.0
    var factor = 10.0
    var cycles = 0
    do {
        println("factor:$factor")
        cycles++
        if (abs(factor * factor - num) < offset) return factor else factor = (factor + num / factor) / 2
    } while (cycles < 100)
    return -1.0
}

fun main(args: Array<String>) {
    println("result：${square(12450.0, 0.2)}")
}