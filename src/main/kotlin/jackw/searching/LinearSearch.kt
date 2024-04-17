package jackw.searching

class LinearSearch {

    companion object {
        // Linear search:
        // - Input does not need to be sorted
        // - Iterates over the input in order
        // - If the value is found then the index it is found at is returned
        // - If the value is not found then -1 is returned
        // Time Complexity: Best - O(1) Average - O(n) Worst - O(n)
        // NOTE: Best case is when the value is in the first index.
        // Declare method to perform the search, taking an array and searchFor as params
        fun linearSearch(arr: IntArray, searchFor: Int): Int {
            // Iterate over array in order until fully traversed

            for (i in arr.indices) {
                // Verify whether the value being searched for is held at the current index location
                // If it is - return the index as the value is now found
                // If it is not - continue to the next iteration and perform the check again

                if (arr[i] == searchFor) {
                    return i
                }
            }

            // If the value is not found in the input array then return -1
            return -1
        }
    }
}