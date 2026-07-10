package Recursion.Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid)); // making new copies
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length)); // making new copies

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0,j=0,k=0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining element

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    // In place merge sort :

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSortInPlace(arr, s, mid); 
        mergeSortInPlace(arr, mid, e); 

        mergeInPlace(arr, s , mid, e);
    }
    private static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];

        int i=start,j=mid,k=0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining element
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length; l++){
            arr[start+l] = mix[l];
        }
    }
}