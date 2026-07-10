package Recursion.Sorting;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        // System.out.println(check(arr)); // method 1
        System.out.println(isSorted(arr,0)); // method 2
    }

    // Method 2
    static boolean check(int[] arr){
        return helper(arr,0);
    }
    private static boolean helper(int[] arr,int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            return helper(arr, i+1);
        }
        return false;
    }

    // More simplyfied - method 2:
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}