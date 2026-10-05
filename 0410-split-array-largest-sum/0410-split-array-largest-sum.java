class Solution {
    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        // Minimum possible answer = maximum element
        // Maximum possible answer = sum of all elements
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        // Binary Search
        while (start < end) {

            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            // Check how many subarrays are needed
            for (int num : nums) {

                if (sum + num > mid) {
                    // Create a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            // Need more pieces increase allowed sum
            if (pieces > k) {
                start = mid + 1;
            } 
            // Possible answer try smaller sum
            else {
                end = mid;
            }
        }

        return start;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna