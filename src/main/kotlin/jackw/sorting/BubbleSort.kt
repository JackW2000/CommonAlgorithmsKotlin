package jackw.sorting

class BubbleSort {

    companion object {
        // Bubble sort:
        // - Works from left to right
        // - Moves the largest value to its correct location in each iteration
        // Time Complexity: Best - O(n) Average - O(n^2) Worst - O(n^2)
        // Declare method to perform the sort, taking an array as param
        fun bubbleSort(arr: IntArray): IntArray {
            // Loop through the array until the array length is met

            for (i in 0 until arr.size - 1) {
                // Loop through the array - iteration from prior loop as outer-most value will be sorted already - 1 (index from 0)

                for (j in 0 until arr.size - i - 1) {
                    // Compare value to the following position and swap if following value is smaller

                    if (arr[j] > arr[j + 1]) {
                        // Use arithmetic to swap values without needing a temp variable

                        arr[j] = arr[j] + arr[j + 1]
                        arr[j + 1] = arr[j] - arr[j + 1]
                        arr[j] = arr[j] - arr[j + 1]
                    }
                }
            }
            return arr
        }
    }
}