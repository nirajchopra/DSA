class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int currentCount = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				currentCount++;
			} else if (arr[i] == 0) {
				currentCount = 0;
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
			}
		}
        return maxCount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna