package searchTests

import jackw.managers.SearchingManager
import jackw.managers.SortingManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinarySearchTest {

    private var searchingManager: SearchingManager = SearchingManager()
    private var sortingManager: SortingManager = SortingManager()

    private var unsortedArr: IntArray = intArrayOf(10, 5, 60, 54, 1, 57, 19, 954, 15, 30)
    private lateinit var sortedArr: IntArray

    @Test
    fun whenSearchForValueInList_thenSearchIndexCorrectlyReturned() {
        sortedArr = sortingManager.mergeSort(unsortedArr)

        val searchIndex: Int = searchingManager.binarySearch(unsortedArr, 54)
        Assertions.assertEquals(6, searchIndex)
    }

    @Test
    fun whenSearchForValueNotInList_thenSearchReturnsNegativeOne() {
        sortedArr = sortingManager.mergeSort(unsortedArr)

        val searchIndex: Int = searchingManager.binarySearch(unsortedArr, 123)
        Assertions.assertEquals(-1, searchIndex)
    }

}