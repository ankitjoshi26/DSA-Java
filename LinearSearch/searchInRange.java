package LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {1,2,3,4,5,6,7,8};
        int strt = 1, end = 4;  
        int target = 7;
        int ans = search(nums, strt, end, target);
        System.out.println("index of element: " + ans);
    }
    
    static int search(int[] arr,int strt,int end,int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = strt; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
