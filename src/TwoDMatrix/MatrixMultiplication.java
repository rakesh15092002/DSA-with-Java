package TwoDMatrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first matrix
        System.out.print("Enter number of rows for first matrix: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int c1 = scanner.nextInt();

        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.print("Enter number of rows for second matrix: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int c2 = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible: columns of first != rows of second.");
            return;
        }

        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiply using 'sum' variable
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0; // reset sum for each element
                for (int k = 0; k < c1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        // Print the result
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
