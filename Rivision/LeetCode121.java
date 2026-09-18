public class LeetCode121 {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(findAnswer(arr));
    }

    public static int findAnswer(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }else if (arr[i] > max){
                max = arr[i];
            }
        }

        return ((max-min) > 0 ? (max-min) : 0);
    }
}
