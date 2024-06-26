package jackw.sorting

class SelectionSort {

    companion object {

        // Selection sort:
        // - Divides an array into 2 portions
        // - The left division being treated as sorted
        // - The right division being treated as unsorted
        // - Moves the smallest item in each iteration into it's position in the sorted half
        // Time Complexity: Best - O(n2) Average - O(n2) Worst - O(n2)
        // Declare method to perform the sort, taking an array as param
        fun selectionSort(arr: IntArray?): IntArray {
            for (i in arr?.indices!!) {
                // Assume index i to be the smallest for the first pass
                // The loop will increment so all values below i should be sorted correctly
                var minVal = i

                // Loop for i+1 as value at index i is being used for comparison and swap
                for (j in i + 1 until arr.size) {
                    // If the value at index j is less, update the index for minVal

                    if (arr[j] < arr[minVal]) {
                        minVal = j
                    }
                }

                // Once the j loop terminates, min_val will hold the position of the smallest value
                // Using this index, swap the values of index i and minVal
                val temp = arr[i]
                arr[i] = arr[minVal]
                arr[minVal] = temp
            }
            return arr
        }
    }
}