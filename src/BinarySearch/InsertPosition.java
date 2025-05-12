package BinarySearch;

public class InsertPosition {
public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Correct mid calculation

            if (nums[mid] == target) {
                return mid; // Target found, return the index
            } else if (nums[mid] < target) {
                left = mid + 1; // Move right if target is greater
            } else {
                right = mid - 1; // Move left if target is smaller
            }
        }

        // If not found, left is the position where target should be inserted
        return left;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,6,9,15};
        int target = 8;
        System.out.println(searchInsert(arr, target));
        
    }
}
