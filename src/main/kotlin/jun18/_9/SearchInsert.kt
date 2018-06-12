package main.kotlin.jun18._9

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 */
fun searchInsertA(nums: IntArray, target: Int): Int {
    if (target < nums[0]) return 0
    for (i in nums.indices) {
        if (target == nums[i]) return i
        if (target < nums[i] && target > nums[i - 1]) return i
    }
    return nums.size
}

fun searchInsertB(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left < right) {
        val mid = right - left
        if (target == nums[mid]) return mid else if (target > nums[mid]) left = mid + 1 else right = mid - 1
    }
    return left
}


fun main(args: Array<String>) {
    println(searchInsertA(intArrayOf(1, 3, 5, 6), 2))
}