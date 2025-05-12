package BinarySearch;

public class UpperBound {
    public static int findUpper(int[]arr,int target){
        int ans=0;
        int left = 0 ;
        int right = arr.length-1;
        while (left<=right) {
            int mid = left + (right-left)/2;
            if(arr[mid]<=target){
                left = mid+1;
                ans = mid +1;

            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    int [] arr = {1,4,6,7,9,11,14,17};
    int target = 10;
    System.out.println(findUpper(arr,target));
    
}
}
