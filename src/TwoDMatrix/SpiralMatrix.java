package TwoDMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    // Method to traverse the matrix in spiral order
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int minr = 0;  // Minimum row
        int minc = 0;  // Minimum column
        int maxr = matrix.length - 1;  // Maximum row
        int maxc = matrix[0].length - 1;  // Maximum column

        while (minr <= maxr && minc <= maxc) {
            // Traverse the top row (left to right)
            for (int i = minc; i <= maxc; i++) {
                res.add(matrix[minr][i]);
            }

            // Traverse the right column (top to bottom)
            for (int i = minr + 1; i <= maxr; i++) {
                res.add(matrix[i][maxc]);
            }

            // Traverse the bottom row (right to left)
            if (minr < maxr) {
                for (int i = maxc - 1; i >= minc; i--) {
                    res.add(matrix[maxr][i]);
                }
            }

            // Traverse the left column (bottom to top)
            if (minc < maxc) {
                for (int i = maxr - 1; i > minr; i--) {
                    res.add(matrix[i][minc]);
                }
            }

            // Update the boundaries
            minr++;
            maxr--;
            minc++;
            maxc--;
        }

        return res;  // Return the spiral order result
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        SpiralMatrix obj = new SpiralMatrix();
        List<Integer> result = obj.spiralOrder(matrix);

        // Print the result
        System.out.println("Spiral Order: " + result);
    }
}
