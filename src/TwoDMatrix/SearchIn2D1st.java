package TwoDMatrix;

public class SearchIn2D1st {

    // Method to search for the target in the matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;       // Number of rows
        int n = matrix[0].length;    // Number of columns

        int endCol = n - 1;          // Start from the top-right corner
        int startRow = 0;

        // Traverse until we reach the bottom row or left-most column
        while (startRow < m && endCol >= 0) {
            if (target == matrix[startRow][endCol]) {
                return true; // Element found
            }
            // Move down if the target is larger than the current element
            else if (target > matrix[startRow][endCol]) {
                startRow++;
            }
            // Move left if the target is smaller than the current element
            else {
                endCol--;
            }
        }
        return false;  // Element not found
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target = 5;

        SearchIn2D1st obj = new SearchIn2D1st();
        boolean result = obj.searchMatrix(matrix, target);

        if (result) {
            System.out.println("Element " + target + " found in the matrix.");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
