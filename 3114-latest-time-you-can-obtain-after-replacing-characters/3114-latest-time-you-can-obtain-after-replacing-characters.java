class Solution {
    public String findLatestTime(String s) {

        char[] t = s.toCharArray();

        // First hour digit
        if (t[0] == '?') {
            if (t[1] == '?' || t[1] <= '1') {
                t[0] = '1';
            } else {
                t[0] = '0';
            }
        }

        // Second hour digit
        if (t[1] == '?') {
            if (t[0] == '1') {
                t[1] = '1';
            } else {
                t[1] = '9';
            }
        }

        // First minute digit
        if (t[3] == '?') {
            t[3] = '5';
        }

        // Second minute digit
        if (t[4] == '?') {
            t[4] = '9';
        }

        return new String(t);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna