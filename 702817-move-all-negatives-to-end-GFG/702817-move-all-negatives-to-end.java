class Solution {
    public void segregateElements(int[] arr) {

        int[] temp = new int[arr.length];
        int index = 0;

        // Store positive elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Store negative elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy elements back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna