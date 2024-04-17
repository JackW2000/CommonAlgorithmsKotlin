package searchTests

import jackw.managers.SearchingManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LinearSearchTest {
    private var searchingManager: SearchingManager = SearchingManager()

    private var unsortedArr: IntArray = intArrayOf(10, 5, 60, 54, 1, 57, 19, 954, 15, 30)

    @Test
    fun whenSearchForValueInList_thenSearchIndexCorrectlyReturned() {
        val searchIndex: Int = searchingManager.linearSearch(unsortedArr, 54)
        Assertions.assertEquals(3, searchIndex)
    }

    @Test
    fun whenSearchForValueNotInList_thenSearchReturnsNegativeOne() {
        val searchIndex: Int = searchingManager.linearSearch(unsortedArr, 123)
        Assertions.assertEquals(-1, searchIndex)
    }
}