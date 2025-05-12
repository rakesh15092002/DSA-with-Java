package BinarySearch;

public class LowerBound {
    public static int findLower(int [] arr,int target){
        int left = 0 , right = arr.length-1;
        int ans=0;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]>=target){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    int [] arr = {2,5,8,15,19};
    int target = 7;
    System.out.println(findLower(arr,target));
}
}
