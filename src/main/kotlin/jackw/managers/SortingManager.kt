package jackw.managers

import jackw.sorting.*

class SortingManager {

    fun bubbleSort(arr: IntArray): IntArray {
        return BubbleSort.bubbleSort(arr)
    }

    fun insertionSort(arr: IntArray): IntArray {
        return InsertionSort.insertionSort(arr)
    }

    fun mergeSort(arr: IntArray): IntArray {
        return MergeSort.mergeSort(arr)
    }

    fun quickSort(arr: IntArray): IntArray {
        return QuickSort.quickSort(arr, 0, arr.size.minus(1))
    }

    fun selectionSort(arr: IntArray): IntArray {
        return SelectionSort.selectionSort(arr)
    }
}