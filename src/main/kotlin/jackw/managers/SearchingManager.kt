package jackw.managers

import jackw.searching.BinarySearch
import jackw.searching.LinearSearch

class SearchingManager {

    fun linearSearch(arr: IntArray, searchFor: Int): Int {
        return LinearSearch.linearSearch(arr, searchFor)
    }

    fun binarySearch(arr: IntArray, searchFor: Int): Int {
        return BinarySearch.binarySearch(arr, searchFor, 0, arr.size)
    }
}