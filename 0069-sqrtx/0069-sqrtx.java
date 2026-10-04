class Solution {
    public int mySqrt(int x) { 
        if(x < 2) return x;

        long start = 1, end = x / 2;

        while(start <= end){
            long mid = start + (end - start) / 2;
            if(mid * mid == x){
                return (int) mid;
            }
            if(mid * mid < x){
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