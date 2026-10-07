class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;

         for(int x : aliceSizes){
            aliceSum += x;
        }
        for(int x : bobSizes){
            bobSum += x;
        }

        int diff = (aliceSum - bobSum) / 2;

        HashSet<Integer> set = new HashSet<>();
        for(int x : bobSizes){
            set.add(x);
        }
        for(int a : aliceSizes){
            int b = a - diff;
            
            if(set.contains(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna