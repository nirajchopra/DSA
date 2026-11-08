class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("--X")) {
                X -= 1;
            }
            else if (operations[i].equals("X--")) {
                X -= 1;
            }
            else {
                X += 1;
            }
        }

        return X;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna