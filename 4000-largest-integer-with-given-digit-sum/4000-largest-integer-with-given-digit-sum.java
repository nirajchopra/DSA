class Solution {
    public int largestInteger(int n, int s) {
        if(s > n * 9){
            return -1;
        }

        int ans = 0;

        for(int i=0; i<n; i++){
            int digit = Math.min(s,9);
            ans = ans * 10 + digit;
            s = s - digit;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna