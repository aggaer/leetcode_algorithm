package main.kotlin.jun18._5

/**
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) return l2 else if (l2 == null) return l1
    val result: ListNode
    if (l1.`val` <= l2.`val`) {
        result = l1
        result.next = mergeTwoLists(l1.next, l2)
    } else {
        result = l2
        result.next = mergeTwoLists(l2.next, l1)
    }
    return result
}

class ListNode(internal var `val`: Int) {
    internal var next: ListNode? = null
}
