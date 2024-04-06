package org.example.dataStructures

class DynamicArray<T> {

    private val nItems = 0
    private val arrayCapacity = 1
    private val array: Array<Any?>

    init {
        array = createArray(arrayCapacity = arrayCapacity)
    }

    fun length() : Int  {
        return nItems
    }

    fun getItem(idx: Int) : Any? {
        if (idx <= 0 && idx >= this.nItems) {
            throw IndexOutOfBoundsException()
        }
        return array[idx]
    }

    private fun createArray(arrayCapacity: Int) : Array<Any?> {
        val array = arrayOfNulls<Any?>(arrayCapacity)
        return array
    }
}