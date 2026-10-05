class Solution {

    public boolean search(int[] nums, int target) {

        int pivot = findPivotWithDuplicates(nums);

        // No rotation
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Pivot itself is target
        if (nums[pivot] == target) {
            return true;
        }

        // Search left side
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Search right side
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid - 1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Duplicate values
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                // Check start
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;

                // Check end
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;
            }

            // Left side is sorted
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {

                start = mid + 1;
            }

            // Right side is sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static boolean binarySearch(int[] arr, int target,
                                int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna