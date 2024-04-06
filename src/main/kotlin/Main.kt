package org.example

import org.example.dataStructures.DynamicArray


fun main() {

    val dynamicArray = DynamicArray<Int>()
    println(dynamicArray.toString())
    println("Current number of items: ${dynamicArray.length()}")
    println("Get item: ${dynamicArray.getItem(idx = 3)}")
}