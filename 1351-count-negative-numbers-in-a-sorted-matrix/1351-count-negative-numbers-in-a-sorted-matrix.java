class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] rows : grid){
            int start = 0;
            int end = rows.length - 1;

            while(start <= end){
                int mid = start + (end - start) / 2;

                if(rows[mid] < 0)
                {
                    count += end - mid + 1;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna