class Solution {
    int missingNum(int[] arr) {

        int n = arr.length + 1;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int sum1 = 0;

        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }

        return sum1 - sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna