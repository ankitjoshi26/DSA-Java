package BinarySearch;

public class orderAgnosticBs {
    public static void main(String[] args) {
     System.out.println();
     int[] arr = {-15, -10, -8, -3, 1, 2, 3, 5, 6, 11, 13, 22, 54};
    //  int[] arr = {100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1};
     int target = -3;
     System.out.println(agnosticBs(arr, target));

    }
    static int agnosticBs(int[] arr,int target){
        int strt = 0;
        int end = arr.length - 1;

        boolean check = arr[strt] < arr[end];

        while (strt <= end) {

            int mid = strt + (end - strt) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(check){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    strt = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    strt = mid + 1;
                }
            }
        }
        return -1;
    }
}