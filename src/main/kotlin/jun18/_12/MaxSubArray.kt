package main.kotlin.jun18._12

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
fun maxSubArray(nums: IntArray): Int {
    if (nums.size == 1) {
        return nums[0]
    }
    var result = nums[0]
    for (i in 0 until nums.size - 1) {
        var j = i + 1
        var factor = nums[i]
        var max = nums[j]
        while (j < nums.size) {
            factor += nums[j]
            max = if (max > factor) max else factor
            j++
        }
        result = if (result > max) result else max
    }
    return result
}

fun maxSubArrayAqua(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var max = Int.MIN_VALUE
    var sum = 0
    for (i in nums) {
        sum += i
        // 比较最大值和新的累加值
        max = Math.max(max, sum)
        // 累加值为负，则归0，让下次循环的sum取新值；
        // 累计值为正，则会一直与新值想加并且与max进行比对。
        sum = Math.max(sum, 0)
    }
    return max
}

fun main(args: Array<String>) {
//    println(maxSubArray(intArrayOf(-2, -3, -1)))
    println(maxSubArrayAqua(intArrayOf(-3, 3, -1, 2)))
}