class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}

		System.out.print("Sorted Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna