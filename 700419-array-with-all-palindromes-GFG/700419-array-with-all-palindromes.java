class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int original = num;
            int rev = 0;
            
            while(num > 0){
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            
            if(original != rev){
                return false;
            }
        }
        return true;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna