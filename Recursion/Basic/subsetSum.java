package Recursion.Basic;

import java.util.ArrayList;

public class subsetSum {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(sumOfSubset(arr,0,0));
    }
    static ArrayList<Integer> sumOfSubset(int[] arr, int index, int currSum){
        if(index == arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(currSum);
            return list;
        }


        ArrayList<Integer> left = sumOfSubset(arr, index + 1, currSum + arr[index]);
        ArrayList<Integer> right = sumOfSubset(arr, index + 1, currSum);

        left.addAll(right);

        return left;
    }
}
