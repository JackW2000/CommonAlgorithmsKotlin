package jackw.structures

class Node(value: Int) {
    var value = value
    var previousNode: Node? = null
    var nextNode: Node? = null

    // Constructor method
    fun Node(value: Int) {
        this.value = value
    }
}