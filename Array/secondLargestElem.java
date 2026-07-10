package Array;


import java.util.Arrays;
import java.util.Scanner;

public class secondLargestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n=5;
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        boolean found = false;
        for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[n-1]){
               System.out.println(arr[i]);
               found = true;
               break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
    
}
