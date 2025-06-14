package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int[] arr,int i,int minIndex){
        int temp = arr[i];
        arr[i]= arr[minIndex];
        arr[minIndex] = temp;
    }
    public static void slectionSort(int [] arr){
        for(int i = 0 ; i<arr.length ; i++){
            int minIndex = i;
            for(int j = i ;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,23,1,35,20,11};
        slectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
