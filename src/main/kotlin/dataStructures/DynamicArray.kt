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

    operator fun get(idx: Int) : Any? {
        if (idx < 0 || idx >= this.nItems) {
            throw IndexOutOfBoundsException()
        }
        return this.array[idx]
    }

    override fun toString() : String {
        return array.contentToString()
    }

    fun append(newItem: T) {
        if (nItems == arrayCapacity) {
            this.resizeArray()
        }
        this.array[this.nItems] = newItem
        this.nItems += 1
    }

    private fun resizeArray() : Array<Any?> {
        val newCapacity = this.arrayCapacity * 2
        val newArray = createArray(arrayCapacity = newCapacity)

        for (i in 0 until nItems) {
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
