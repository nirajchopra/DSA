class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, max = 0;

        // Left to Right
        for (char c : s.toCharArray()) {
            if (c == '(') left++;
            else right++;

            if (left == right)
                max = Math.max(max, 2 * right);
            else if (right > left)
                left = right = 0;
        }

        // Right to Left
        left = right = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right)
                max = Math.max(max, 2 * left);
            else if (left > right)
                left = right = 0;
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna