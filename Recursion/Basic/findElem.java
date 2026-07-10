package Recursion.Basic;

public class findElem {
    public static void main(String[] args) {
     int[] arr = {23,12,54,34,78};
    //  System.out.println(find(arr, 34, 0));   
     System.out.println(findIndex(arr,54,0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index + 1);
        }
    }
}