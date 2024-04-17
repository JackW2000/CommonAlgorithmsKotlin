package structureTests

import jackw.structures.LinkedList
import jackw.structures.Node
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LinkedListTest {
    @Test
    fun whenAppendNodeCalled_thenNodeAddedToLinkedList() {
        val nodeA: Node = Node(10)
        val link = LinkedList(nodeA)

        link.printLinkedList()

        link.appendNode(Node(20))

        assertEquals(10, link.firstNode.value)
        assertEquals(20, link.lastNode.value)
        assertEquals(2, link.getListLength())
    }

    @Test
    fun whenPrependNodeCalled_thenNodeAddedToLinkedList() {
        val nodeA: Node = Node(10)
        val link: LinkedList = LinkedList(nodeA)

        link.printLinkedList()

        link.prependNode(Node(20))

        assertEquals(10, link.lastNode.value)
        assertEquals(20, link.firstNode.value)
        assertEquals(2, link.getListLength())
    }

    @Test
    fun whenRemoveFirstNodeCalled_thenFirstNodeRemovedFromLinkedList() {
        val nodeA: Node = Node(10)
        val link: LinkedList = LinkedList(nodeA)

        link.printLinkedList()

        link.prependNode(Node(20))

        assertEquals(10, link.lastNode.value)
        assertEquals(20, link.firstNode.value)
        assertEquals(2, link.getListLength())

        link.removeFirstNode()

        assertEquals(10, link.firstNode.value)
        assertEquals(1, link.getListLength())
    }

    @Test
    fun whenRemoveEndNodeCalled_thenEndNodeRemovedFromLinkedList() {
        val nodeA: Node = Node(10)
        val link: LinkedList = LinkedList(nodeA)

        link.printLinkedList()

        link.prependNode(Node(20))

        assertEquals(10, link.lastNode.value)
        assertEquals(20, link.firstNode.value)
        assertEquals(2, link.getListLength())

        link.removeEndNode()

        assertEquals(20, link.firstNode.value)
        assertEquals(1, link.getListLength())
    }

    @Test
    fun whenAppendNodeByValueCalled_thenNodeAddedToLinkedList() {
        val nodeA: Node = Node(10)
        val link: LinkedList = LinkedList(nodeA)

        link.printLinkedList()

        link.appendNodeByValue(20)

        assertEquals(10, link.firstNode.value)
        assertEquals(20, link.lastNode.value)
        assertEquals(2, link.getListLength())
    }

    @Test
    fun whenPrependNodeByValueCalled_thenNodeAddedToLinkedList() {
        val nodeA: Node = Node(10)
        val link: LinkedList = LinkedList(nodeA)

        link.printLinkedList()

        link.prependNodeByValue(20)

        assertEquals(10, link.lastNode.value)
        assertEquals(20, link.firstNode.value)
        assertEquals(2, link.getListLength())
    }
}