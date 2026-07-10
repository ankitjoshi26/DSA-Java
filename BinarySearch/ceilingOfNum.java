package BinarySearch;

public class ceilingOfNum {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {8,10,12,15,18,19,20,21,22};
        int ans = find(arr, 17);
        System.out.println(ans );
    }
    static int find(int[] arr,int target){
       int strt = 0;
       int end = arr.length - 1;

       if(target > arr[end]){
        return -1;
       }
       boolean check = arr[strt] < arr[end];

        while (strt <= end) {

            int mid = strt + (end - strt) / 2;

            if(target == arr[mid]){
                return arr[mid];
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
        return arr[strt];
    }
}