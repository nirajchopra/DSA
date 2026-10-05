/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndex(mountainArr);

        // Search in ascending part
        int ans = binarySearch(mountainArr, target, 0, peak, true);

        if (ans != -1) {
            return ans;
        }

        // Search in descending part
        return binarySearch(mountainArr, target, peak + 1,
                            mountainArr.length() - 1, false);
    }

    // Find peak index
    int peakIndex(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Binary search
    int binarySearch(MountainArray arr, int target,
                     int start, int end, boolean isAsc) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            }

            if (isAsc) {

                if (target < value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna