package main.kotlin.june18._4

import java.util.*

/**
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。
 */
fun isValid(s: String): Boolean {
    if (s == "") return true
    val stack = Stack<Char>()
    s.forEach {
        when (it) {
            '(', '[', '{' -> stack.push(it)
            ')' -> if (stack.isNotEmpty() && '(' == stack.peek()) stack.pop() else return false
            ']' -> if (stack.isNotEmpty() && '[' == stack.peek()) stack.pop() else return false
            '}' -> if (stack.isNotEmpty() && '{' == stack.peek()) stack.pop() else return false
        }
    }
    return stack.empty()
}


fun main(args: Array<String>) {
    println(isValid("(([]){})"))

}