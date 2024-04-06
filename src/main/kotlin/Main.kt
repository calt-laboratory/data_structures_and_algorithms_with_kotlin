package org.example

import org.example.dataStructures.DynamicArray


fun main() {
    val dynamicArray = DynamicArray<Int>()
    println(dynamicArray)
    println("Current number of items: ${dynamicArray.length()}")
    dynamicArray.append(newItem = 42)
    println("Current number of items: ${dynamicArray.length()}")
    val idx0 = 0
    println("Get item: ${dynamicArray.getItem(idx = 0)} at idx: $idx0")
    dynamicArray.append(newItem = 1987)
    val idx1 = 1
    println("Get item: ${dynamicArray.getItem(idx = 1)} at idx: $idx1")
}
