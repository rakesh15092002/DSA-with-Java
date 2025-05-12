package BinarySearch;

public class FindFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        // Find first occurrence
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) first = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Find last occurrence
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) last = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 9, 10};
        int target = 8;
        int[] res = searchRange(arr, target);
        System.out.println("First and Last Position of " + target + ":");
        for (int pos : res) {
            System.out.println(pos);
        }
    }
}
