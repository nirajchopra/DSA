class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        int maxNum = num;

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {

                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;

                int currentNum = Integer.parseInt(new String(digits));

                maxNum = Math.max(maxNum, currentNum);

                temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
            }
        }

        return maxNum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna