package main.kotlin.jun18._7

/**
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) return 0
    var k = nums.size - 1
    nums.forEachIndexed { index, i ->
        if (i == `val`) {
            while (nums[k] == `val` && k > index) {
                k--
            }
            if (index == k) {
                return k
            } else {
                val temp = nums[index]
                nums[index] = nums[k]
                nums[k] = temp
            }
        }
    }
    return k + 1
}

fun main(args: Array<String>) {
    println(removeElement(intArrayOf(1), 1))
}