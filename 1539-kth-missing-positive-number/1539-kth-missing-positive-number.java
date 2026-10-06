class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna