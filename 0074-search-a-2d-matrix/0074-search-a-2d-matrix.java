class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Convert 1D index into 2D row and column
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            } 
            else if (matrix[row][col] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna