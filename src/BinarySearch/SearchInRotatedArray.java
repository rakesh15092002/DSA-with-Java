package BinarySearch;

public class SearchInRotatedArray {
public static int sInRotatedArray(int []arr , int target){
    int left = 0 ;
    int right = arr.length-1;
    while (left<=right) {
        int mid = left + (right-left)/2;
        if(arr[mid]==target) return mid;

        // left sorted array
        if(arr[left]<=arr[mid]){
            if(arr[left] <= target && target<=arr[mid] ){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        // right sorted arr hai
        else{
            if(arr[mid] < target && target<=arr[right]){
                left= mid+1;
            }
            else{
                right = mid-1;
            }
        }
    }
    return -1;
}
public static void main(String[] args) {
    int [] arr = {4,5,6,7,0,1,2};
    int target = 1;
    System.out.println(sInRotatedArray(arr, target));
}
}
