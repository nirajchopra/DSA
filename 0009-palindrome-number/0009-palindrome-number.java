class Solution {

    // Method to check if a number is a palindrome
    public boolean isPalindrome(int num) {
        // Negative numbers and numbers ending in 0 (but not 0) are not palindromes
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int reversed = 0;

        while (num > reversed) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        // For even digits: reversed == num
        // For odd digits: reversed/10 == num
        return (num == reversed || num == reversed / 10);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] testCases = {121, -121, 10, 0};

        for (int num : testCases) {
            boolean result = sol.isPalindrome(num);
            System.out.println("Input: " + num + " → Output: " + result);
        }
    }
}