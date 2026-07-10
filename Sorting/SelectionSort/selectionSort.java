package Sorting.SelectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getIndexOfMaxElement(int[] arr, int start, int end){  //maximum finder
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max] < arr[i]){
                max = i ;
            }
        }
        return max;
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining and swap with correct index.
            int last = arr.length - i - 1;
            int indexOfMaxElement = getIndexOfMaxElement(arr, 0, last);         //passing array,first Index and last Index.
            swap(arr,indexOfMaxElement,last);
        }
    }
}
