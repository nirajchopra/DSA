class Solution {
    public int[] productExceptSelf(int[] arr) {

        int n = arr.length;
	    int[] result = new int[n];

	    // Step 1: Store prefix products
	    result[0] = 1;

	    for (int i = 1; i < n; i++) {
	        result[i] = result[i - 1] * arr[i - 1];
	    }

	    // Step 2: Multiply by suffix products
	    int suffix = 1;

	    for (int i = n - 1; i >= 0; i--) {
	        result[i] = result[i] * suffix;
	        suffix = suffix * arr[i];
	    }

	   return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna