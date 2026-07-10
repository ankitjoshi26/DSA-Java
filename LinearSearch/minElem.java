package LinearSearch;

public class minElem {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {12,32,43,122,30,55};
        int ans = min(arr);
        System.out.println("minimum value is: " + ans);
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(ans > arr[index]){
                ans = arr[index];
            }
        }
        return ans;
    }
}
