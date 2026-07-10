package Rivison;

import java.util.HashMap;

public class MajorityElem {
    public static void main(String[] args) {
        int[] nums = {2,4,1,2,2,4,4,4,4,4};
        System.out.println(helper(nums));
    }

    public static int helper(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) > (arr.length/2)){
                return arr[i];
            }
        }

        return -1;
    }
}
