package Sorting.BubbleSort;

import java.util.Arrays;

import Array.swapElem;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        bubble(arr); 
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

