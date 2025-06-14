package BinarySearch;
public class PeakElement {
 public static int findPeakElement(int[] nums) {
        int left = 1;
        int right = nums.length - 2;
        if (nums.length == 1) return 0;
         if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid; 
            } else if (nums[mid] < nums[mid + 1]) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,4,5,6,7,3};
        System.out.println(findPeakElement(arr));
    }
    
}
