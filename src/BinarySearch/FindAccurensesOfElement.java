package BinarySearch;

public class FindAccurensesOfElement {
    public static int findOccur(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lower = -1;
        int upper = -1;

        // Finding lower bound (first occurrence index)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            lower = left;
        }

        left = 0;
        right = arr.length - 1;

        // Finding upper bound (last occurrence index + 1)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            upper = left;
        }

        int length = upper - lower;
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;
        int result = findOccur(arr, target);
        System.out.println("Occurrences of " + target + ": " + result);
    }
}
