package LinearSearch;

public class noOfDigits {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {12,3,4,122,222,1};
        int ans = findNumbers(arr);
        // System.out.println("even number are: " + ans);    // for counting even numbers.
        // System.out.println(digit(0));                     // for counting numbers.
    }
    
    static int findNumbers(int[] arr){
        int count = 0;
        // for(int num : arr){
        //     if(even(num)){
        //         count ++;
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int ans = digit(num);
        // if(ans % 2 == 0){
        //     return true;
        // }
        // return false;
        return ans % 2 == 0;
    }

    static int digit(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}