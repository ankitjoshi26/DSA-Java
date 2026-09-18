package Rivision;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = findAns(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] findAns(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find = target - nums[i];
            if(map.containsKey(find)){
                return new int[] {map.get(find), i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[] {-1,-1};
    }
}
