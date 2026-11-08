class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);

            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna