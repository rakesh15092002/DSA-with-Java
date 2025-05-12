package TwoDMatrix;

import java.util.ArrayList;
import java.util.List;

public class SetZeros {

    // Method to set entire row and column to 0 if an element is 0
    public void setZeroes(int[][] matrix) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        // Step 1: Identify all the rows and columns to be zeroed
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    x.add(i);  // Row index where the zero occurs
                    y.add(j);  // Column index where the zero occurs
                }
            }
        }

        // Step 2: Set rows to 0 based on the indices in x
        for (int i = 0; i < x.size(); i++) {
            int row = x.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        // Step 3: Set columns to 0 based on the indices in y
        for (int j = 0; j < y.size(); j++) {
            int col = y.get(j);
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 0, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}
        };

        // Create an object of SetZeros and call setZeroes method
        SetZeros obj = new SetZeros();
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        obj.setZeroes(matrix);
        
        System.out.println("\nMatrix After Setting Zeros:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
