class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for(char c : s.toCharArray()){
            freq[c]++;
        }

        int ans = 0;
        for(int count : freq){
            ans += (count / 2) * 2;


            if(count % 2 == 1 && ans % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna