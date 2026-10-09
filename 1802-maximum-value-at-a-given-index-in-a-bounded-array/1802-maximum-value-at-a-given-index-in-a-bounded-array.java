class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int start = 1;
        int end = maxSum;
        int ans = 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long sum = calculateSum(n, index, mid);

            if(sum <= maxSum){
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private long calculateSum(int n, int index, int value){
        long left = calculateSide(value, index);
        long right = calculateSide(value, n - index - 1);

        return left + value + right;
    }

    private long calculateSide(int value, int length){
        if(length < value - 1){
            return (long) (value - 1 + value - length) * length / 2;
        }
            long sum = (long) value * (value - 1) / 2;
            return sum + (length - (value - 1));
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna