class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start + 1, end + 1};
            } else if(sum < target){
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna