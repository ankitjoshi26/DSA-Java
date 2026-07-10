package Array;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5};
        int key = 4;
        int length = arr.length-1;
        int i = check(arr, key);
        if(i == -1){
            System.out.println("Element not found");
            return;
        }
        while (i < length) {
            arr[i] = arr[i+1];
            i++;
        }
        arr[length] = 0;
        System.out.println(Arrays.toString(arr));
    }
    private static int check(int[] arr, int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}