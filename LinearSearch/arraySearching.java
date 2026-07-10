package LinearSearch;

public class arraySearching {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {1,2,3,4,21,32,12,55,44,33};
        int target = 4;
        int ans = linearSearch(nums, target);
        System.out.println("index of target is: "+ ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }
}
