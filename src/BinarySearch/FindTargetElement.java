package BinarySearch;

import java.util.Scanner;

public class FindTargetElement {
    public int findElement(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // ✅ Corrected assignment
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        FindTargetElement obj = new FindTargetElement();
        int result = obj.findElement(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        sc.close(); // Good practice to close the scanner
    }
}
