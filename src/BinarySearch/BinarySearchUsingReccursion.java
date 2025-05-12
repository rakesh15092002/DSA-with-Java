package BinarySearch;

public class BinarySearchUsingReccursion {
    public int searchUsingRec(int [] arr,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            return searchUsingRec(arr,target ,left,mid-1);
        }
        else{
             return searchUsingRec(arr,target, mid+1,right);
        }

    }
    public static void main(String[] args) {
        int [] arr = {-1,-4,2,4,5,6};
        int left = 0, right = arr.length-1;
        int target = 6;
        BinarySearchUsingReccursion obj = new BinarySearchUsingReccursion();
        System.out.println(obj.searchUsingRec(arr,target,left,right));
    }
}
