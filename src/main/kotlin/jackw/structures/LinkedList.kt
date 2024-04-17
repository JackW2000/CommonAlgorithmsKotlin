package jackw.structures

import java.util.logging.Logger

class LinkedList(node: Node) {

    var firstNode: Node = node
    var lastNode: Node = node
    private var listLength = 1

    private var logger: Logger = Logger.getLogger("Main")

    fun getListLength(): Int {
        return listLength
    }

    // Method to increment ListLength by 1
    private fun incrementListLength() {
        this.listLength += 1
    }

    // Method to decrement ListLength by 1
    private fun decrementListLength() {
        this.listLength -= 1
    }

    // Append a node to the end of the LinkedList
    fun appendNode(node: Node) {
        // Point the previousNode property to the current last node
        node.previousNode = this.lastNode

        // Update the value of nextNode for the current last node to point at the new node
        lastNode.nextNode = node

        // this.lastNode.setNextNode(node); would also work here
        // I opted to use setters and getters where possible in this example

        // Update the value of lastNode to be the newly appended node
        this.lastNode = node

        // Increment the node counter
        this.incrementListLength()
    }

    // Append a node to the end of the LinkedList
    fun appendNodeByValue(value: Int) {
        // Create a new node
        val node = Node(value)

        // Point the previousNode property to the current last node
        node.previousNode = this.lastNode

        // Update the value of nextNode for the current last node to point at the new node
        lastNode.nextNode = node

        // Update the value of lastNode to be the newly appended node
        this.lastNode = node

        // Increment the node counter
        this.incrementListLength()
    }

    // Insert a node at the beginning of the LinkedList
    fun prependNode(node: Node) {
        // Set the next node value for the new node to point at the current first node
        node.nextNode = this.firstNode

        // Set the previous node for the current first node to be the new node
        firstNode.previousNode = node

        // Set a new firstNode for the LinkedList object
        this.firstNode = node

        // Increment the node counter
        this.incrementListLength()
    }

    // Insert a node at the beginning of the LinkedList
    fun prependNodeByValue(value: Int) {
        // Create a new node
        val node = Node(value)

        // Set the next node value for the new node to point at the current first node
        node.nextNode = this.firstNode

        // Set the previous node for the current first node to be the new node
        firstNode.previousNode = node

        // Set a new firstNode for the LinkedList object
        this.firstNode = node

        // Increment the node counter
        this.incrementListLength()
    }

    // Method to "pop" or "dequeue" the first node from the LinkedList
    fun removeFirstNode() {
        // Output the data from the first node
        logger.info("Removed node value: " + firstNode.value)

        // Set the first node to point at the next node for the existing first node
        this.firstNode = firstNode.nextNode!!

        // Set the previous node for the new start node to null
        firstNode.previousNode = null

        // Decrement the list length
        this.decrementListLength()
    }

    // Method to "pop" or "dequeue" the last node from the LinkedList
    fun removeEndNode() {
        // Output the data from the first node
        logger.info("Removed node value: " + lastNode.value)

        // Set the first node to point at the next node for the existing first node
        this.lastNode = lastNode.previousNode!!

        // Set the next node for the new end node to null
        lastNode.nextNode = null

        // Decrement the list length
        this.decrementListLength()
    }

    // Method to step through a linked list, printing the node values
    fun printLinkedList() {
        var formattedLogMessage: String

        logger.info("Linked list values:")
        // Check that the first node is not NULL
        if (this.firstNode != null) {
            // Get the current node as the fist node
            var currentNode = this.firstNode

            var counter = 0

            // While there is a value in nextNode, print the current node value and update currentNode to be nextNode
            while (currentNode.nextNode != null) {
                formattedLogMessage = String.format("%s: %s", counter, currentNode.value)

                logger.info(formattedLogMessage)
                currentNode = currentNode.nextNode!!
                counter++
            }

            // As the loop will exit when the last node is reached, we must output the value of lastNode here
            formattedLogMessage = String.format("%s: %s", counter, currentNode.value)
            logger.info(formattedLogMessage)
        }
    }
}