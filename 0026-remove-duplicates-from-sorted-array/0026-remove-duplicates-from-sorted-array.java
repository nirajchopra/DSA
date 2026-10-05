class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int unique = 1;
        int high = 1;
        int n  = nums.length;

        while(high < n){
            if(nums[high] == nums[high - 1]){
                high++;
                continue;
            }
            nums[low + 1] = nums[high];
            low++;
            unique++;
            high++;
        }
        return unique;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna