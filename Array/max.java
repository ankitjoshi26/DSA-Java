package Array;

public class max {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {2,43,1,67,4};
        System.out.println("maximum value is: " + max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
