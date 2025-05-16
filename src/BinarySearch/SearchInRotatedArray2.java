package BinarySearch;

public class SearchInRotatedArray2 {

    public static boolean search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return true;

            // 🔁 First, handle duplicates — this must come BEFORE checking for sorted halves
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }

            // ✅ Left half is sorted
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // ✅ Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
    return false;

    
}
public static void main(String[] args) {
    int [] arr = {3,4,5,3,3,3,4,5,3};
    int target = 0;
    System.out.println(search(arr, target));
    
}

}
