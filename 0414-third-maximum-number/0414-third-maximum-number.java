import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int max = nums[n - 1];

        int secondMax = 0;
        int thirdMax = 0;

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;

                if (count == 2) {
                    secondMax = nums[i];
                }

                if (count == 3) {
                    thirdMax = nums[i];
                    return thirdMax;
                }
            }
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna