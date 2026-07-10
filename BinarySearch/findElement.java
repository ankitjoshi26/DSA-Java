package BinarySearch;

public class findElement {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {-15, -10, -8, -3, 1, 2, 3, 5, 6, 11, 13, 22, 54};
        int target = 1;
        System.out.println(find(arr, target));
    }
    static int find(int[] arr,int target){
        int strt = 0;
        int end = arr.length-1;
        
        while(strt <= end){
         int mid = strt + (end - strt) / 2;

         if(target < arr[mid]){
            end = mid - 1;
        }
        else if(target > arr[mid]){
            strt = mid + 1;
        }
        else{
            return mid;
        }
        }
        return -1;
    }  
}