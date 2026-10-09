class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;

        // Find maximum pile
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long hours = 0;

            // Calculate total hours
            for (int pile : piles) {
                hours += (pile + (long) mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                end = mid - 1; 
            } else {
                start = mid + 1; 
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna