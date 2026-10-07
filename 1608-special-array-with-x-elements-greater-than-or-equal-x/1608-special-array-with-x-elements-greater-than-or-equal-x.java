class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=1; i<=n; i++){
            int start = 0;
            int end = n - 1;

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if(nums[mid] >= i){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            int count = n - start;
            if(count == i){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna