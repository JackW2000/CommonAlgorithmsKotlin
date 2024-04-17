package structureTests

import jackw.structures.Node
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NodeTest {
    @Test
    fun whenNodeIsInitialisedWithValue_thenGetValueReturnsThatValue() {
        val nodeA: Node = Node(10)

        assertEquals(10, nodeA.value)
    }

    @Test
    fun whenNodeIsInitialisedWithValueAndThenUpdated_thenGetValueReturnsUpdatedValue() {
        val nodeA: Node = Node(10)

        nodeA.value = 20

        assertEquals(20, nodeA.value)
    }

    @Test
    fun whenSetNextNodeCalled_thenNodeAfterCurrentIsAsExpected() {
        val nodeA: Node = Node(10)
        val nodeB: Node = Node(20)

        nodeA.nextNode = nodeB

        assertEquals(nodeB, nodeA.nextNode)
    }

    @Test
    fun whenPreviousNextNodeCalled_thenNodeBeforeCurrentIsAsExpected() {
        val nodeA: Node = Node(10)
        val nodeB: Node = Node(20)

        nodeA.previousNode = (nodeB)

        assertEquals(nodeB, nodeA.previousNode)
    }

    @Test
    fun whenGetNextNodeCalledAndNextNodeIsNull_thenNullIsReturned() {
        val nodeA: Node = Node(10)

        Assertions.assertNull(nodeA.nextNode)
    }

    @Test
    fun whenGetPreviousNodeCalledAndNextNodeIsNull_thenNullIsReturned() {
        val nodeA: Node = Node(10)

        Assertions.assertNull(nodeA.previousNode)
    }
}