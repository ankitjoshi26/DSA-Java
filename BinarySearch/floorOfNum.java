package BinarySearch;
public class floorOfNum {
    public static void main(String[] args) {
        System.out.println();
     int[] arr = {1,2,3,4,7,8,9,10,11};
     System.out.println(floor(arr, 6));   
    }   
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean check = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < 1){
                return -1;
            }
            if(target == arr[mid]){
                return arr[mid];
            }

            if(check){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
             }
                else{
                    if(target < arr[mid]){
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
        }
        return arr[end];
    }
}