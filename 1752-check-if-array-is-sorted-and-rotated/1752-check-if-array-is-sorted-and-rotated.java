class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                count++;
            }
        }
        if(nums[nums.length - 1] > nums[0]){
            count++;
        }
        return count <= 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna