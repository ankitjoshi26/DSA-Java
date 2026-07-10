package Recursion.Basic;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(check(arr, 0));
    }
    public static boolean check(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] <= arr[i+1]){
            return check(arr, i + 1);
        }else{
            return false;
        }
    }
}