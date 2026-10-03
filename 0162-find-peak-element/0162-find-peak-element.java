class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;

        while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
            i++;
        }

        return i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna