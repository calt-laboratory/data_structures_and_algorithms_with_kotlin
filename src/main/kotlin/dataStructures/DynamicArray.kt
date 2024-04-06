package org.example.dataStructures

class DynamicArray<T> {

    private var nItems = 0
    private var arrayCapacity = 1
    private var array: Array<Any?>

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

    fun append(new_item: T) {
        if (nItems == arrayCapacity) {
            val newCapacity = this.arrayCapacity * 2
            resizeArray(newCapacity = newCapacity)
        }
    }

    private fun resizeArray(newCapacity: Int) : Array<Any?> {
        val newArray = createArray(arrayCapacity = newCapacity)

        for (i in 0 ..nItems) {
            newArray[i] = this.array[i]
        }

        this.array = newArray
        this.arrayCapacity = newCapacity
        return this.array
    }

    private fun createArray(arrayCapacity: Int) : Array<Any?> {
        val array = arrayOfNulls<Any?>(size = arrayCapacity)
        return array
    }


}