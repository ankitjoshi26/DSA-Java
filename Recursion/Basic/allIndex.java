package Recursion.Basic;

import java.util.ArrayList;

public class allIndex {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,4,5};
     ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());   
    //  System.out.println(ans);
    System.out.println(findAllIndex2(arr, 4, 0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    // method 2:
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBillowCalls =  findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBillowCalls);
        return list;
    }
}