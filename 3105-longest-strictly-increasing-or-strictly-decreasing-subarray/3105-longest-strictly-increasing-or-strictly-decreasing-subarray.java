class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int increasingLength = 1;
        int decreasingLength = 1;
        int maxLength = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                increasingLength++;
                decreasingLength = 1;
            } 
            else if (nums[i] < nums[i - 1]) {
                decreasingLength++;
                increasingLength = 1;
            } 
            else {
                increasingLength = 1;
                decreasingLength = 1;
            }

            maxLength = Math.max(maxLength,
                    Math.max(increasingLength, decreasingLength));
        }

        return maxLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna