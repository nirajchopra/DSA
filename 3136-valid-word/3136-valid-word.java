class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowel = true;

                } else {
                    consonant = true;
                }
            }
        }

        return vowel && consonant;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna