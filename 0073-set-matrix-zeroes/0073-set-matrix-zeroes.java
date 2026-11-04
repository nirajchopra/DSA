class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
            }
        }

        // Check first column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set marked rows and columns to zero
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row to zero
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero
        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna