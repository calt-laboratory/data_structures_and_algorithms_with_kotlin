package dataStructures


class Stack<T> {
    private var items = mutableListOf<T>()

    val size: Int get() = items.size

    fun push(item: T) = items.add(item)

    fun pop() {
        if (items.isEmpty()) throw Exception("pop() called on empty stack")
        items.removeLast()
    }

    fun peek() : T {
        if (items.isEmpty()) throw Exception("peek() called on empty stack")
        return items.last()
    }

    fun isEmpty() : Boolean {
        return items.isEmpty()
    }

    override fun toString() : String = items.toString()
}


fun main() {
    val stack = Stack<String>()
    println(stack.size)
    println(stack.isEmpty())
    println(stack)
    stack.push(item = "noise")
    println(stack.peek())
    stack.push(item = "science")
    println(stack.peek())
    stack.push(item = "math")
    println(stack.peek())
    println(stack)
    println(stack.isEmpty())
    println(stack.pop())
    println(stack.pop())
    println(stack.peek())
    println(stack.pop())
    println(stack.isEmpty())
    println(stack.size)
    stack.pop()
}
