class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while(start <= end){
            long mid = start + (end - start) / 2;
            long coins = mid * (mid + 1) / 2;

            if(coins == n){
                return (int) mid;
            } else if(coins < n){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna