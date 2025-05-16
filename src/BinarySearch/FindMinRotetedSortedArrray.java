package BinarySearch;

public class FindMinRotetedSortedArrray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(left<= right){
            int mid = left + (right-left)/2;
            
            
            // left half
            if(nums[left]<=nums[mid]){
                min = Math.min(nums[left],min);
                left = mid +1;

            }
            else{
                min = Math.min(nums[mid],min);
                right = mid-1;
            }
        }
        return min;
    
}
public static void main(String[] args) {
    int []arr = {3,4,6,1,2};
    System.out.println(findMin(arr));
}
}
