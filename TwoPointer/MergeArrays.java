import java.util.Arrays;

public class MergeArrays{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,9,8,7};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    static int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                ans[index] = arr1[i];
                i++;
            }else{
                ans[index] = arr2[j];
                j++;
            }
            index++;
        }

        while(i < arr1.length){
            ans[index++] = arr1[i++];
        }

        while(j < arr2.length){
            ans[index++] = arr2[j++];
        }

        return ans;
    }
}