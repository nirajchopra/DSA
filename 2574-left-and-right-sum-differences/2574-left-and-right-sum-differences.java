class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;

        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }

        int leftSum = 0;
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna