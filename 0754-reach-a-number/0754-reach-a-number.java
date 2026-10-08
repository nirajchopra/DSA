class Solution {
    public int reachNumber(int target) {

        target = Math.abs(target);

        int start = 0;
        int end = 1;

        // Find upper bound
        while ((long) end * (end + 1) / 2 < target) {
            end *= 2;
        }

        // Binary Search
        while (start < end) {

            int mid = start + (end - start) / 2;

            long sum = (long) mid * (mid + 1) / 2;

            if (sum >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int n = start;

        long sum = (long) n * (n + 1) / 2;

        // Difference even hona chahiye
        while ((sum - target) % 2 != 0) {
            n++;
            sum += n;
        }

        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna