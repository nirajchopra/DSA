class Solution {
    public int differenceOfSums(int n, int m) {
        int num = 0;
        int num1 = 0;

        for(int i=0; i<=n; i++){
                if(i % m != 0){
                    num += i;
                }
                if(i % m == 0){
                    num1 += i;
                }
        }
        return num-num1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna