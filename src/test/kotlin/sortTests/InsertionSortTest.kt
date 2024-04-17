package sortTests

import jackw.managers.SortingManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InsertionSortTest {

    private var sortingManager: SortingManager = SortingManager()

    private var unsortedArr: IntArray = intArrayOf(10, 5, 60, 54, 1, 57, 19, 954, 15, 30)
    private lateinit var sortedArr: IntArray

    @Test
    fun whenUnsortedArrayPassedIntoMethod_thenArrayIsSortedAfterwards() {
        sortedArr = sortingManager.insertionSort(unsortedArr)

        Assertions.assertEquals(1, sortedArr[0])
        Assertions.assertEquals(5, sortedArr[1])
        Assertions.assertEquals(10, sortedArr[2])
        Assertions.assertEquals(15, sortedArr[3])
        Assertions.assertEquals(19, sortedArr[4])
        Assertions.assertEquals(30, sortedArr[5])
        Assertions.assertEquals(54, sortedArr[6])
        Assertions.assertEquals(57, sortedArr[7])
        Assertions.assertEquals(60, sortedArr[8])
        Assertions.assertEquals(954, sortedArr[9])
    }
}