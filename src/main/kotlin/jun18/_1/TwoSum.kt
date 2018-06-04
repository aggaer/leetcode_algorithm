package main.kotlin.june18._1

fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.isEmpty()) throw IllegalArgumentException("invalid arg nums")
    val map = hashMapOf<Int, Int>()
    for ((i, it) in nums.withIndex()) {
        val flag = target - it
        if (map.containsKey(flag)) return intArrayOf(map[flag]!!.plus(0), i)
        map[it] = i
        println(map)
    }
    throw IllegalArgumentException("invalid arg nums")
}

fun main(args: Array<String>) {
    val result = twoSum(intArrayOf(1, 2, 4, 5, 10), 7)
    println("${result[0]}  **** ${result[1]}")
}



