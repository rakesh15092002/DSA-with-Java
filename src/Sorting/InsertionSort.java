package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void swap(int [] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSort(int[] arr){
        for(int i = 0 ; i<arr.length; i++){
           int j = i;
           while (j > 0 && arr[j-1] > arr[j]) {
            swap(arr, j-1, j);
            j--;
           }
        }
    }

  public static void main(String[] args) {
        int [] arr = {10,23,1,35,20,11};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
