class Solution {
    public void reverseInGroups(int[] arr, int k) {
        
		int n = arr.length;

        for (int i = 0; i < n; i += k) {

          int left = i;
          int right = Math.min(i + k - 1, n - 1);

          while (left < right) {

              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;

              left++;
              right--;
          }
		
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna