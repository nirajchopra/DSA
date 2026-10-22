class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
		int[] result = new int[n];

		int left = 0;
		int right = n - 1;
		int index = n - 1;

		while (left <= right) {

			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];

			if (leftSquare > rightSquare) {
				result[index] = leftSquare;
				left++;
			} else {
				result[index] = rightSquare;
				right--;
			}

			index--;
		}

		return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna