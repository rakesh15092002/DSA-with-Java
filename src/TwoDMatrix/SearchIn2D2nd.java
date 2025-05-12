package TwoDMatrix;

public class SearchIn2D2nd {

    // Helper method to perform binary search on a specific row
    public boolean checkFindOrNot(int[][] mat, int target, int midRow) {
        int n = mat[midRow].length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mat[midRow][mid] == target) {
                return true;  // Element found in the row
            } else if (target < mat[midRow][mid]) {
                end = mid - 1;  // Search the left half
            } else {
                start = mid + 1;  // Search the right half
            }
        }

        return false;  // Element not found in the row
    }

    // Main method to search for the target in the 2D matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int endRow = m - 1;

        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            // Check if target can be in the current row
            if (target >= matrix[midRow][0] && target <= matrix[midRow][n - 1]) {
                return checkFindOrNot(matrix, target, midRow);  // Search in the row
            } else if (target < matrix[midRow][0]) {
                endRow = midRow - 1;  // Move to the upper half
            } else {
                startRow = midRow + 1;  // Move to the lower half
            }
        }

        return false;  // Element not found in the matrix
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        SearchIn2D2nd obj = new SearchIn2D2nd();
        boolean result = obj.searchMatrix(matrix, target);

        if (result) {
            System.out.println("Element " + target + " found in the matrix.");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
