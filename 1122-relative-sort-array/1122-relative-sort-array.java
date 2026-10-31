class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] count = new int[1001];

        // Count frequency
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Arrange according to arr2
        for (int num : arr2) {

            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        // Arrange remaining elements in ascending order
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }

        return arr1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna