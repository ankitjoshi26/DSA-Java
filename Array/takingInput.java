package Array;

import java.util.Arrays;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);


        //for primitives

        //  int [] arr =  new int[5];

        // for(int i=0;i < arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }

        //for objects

        String[] str = new String[5];

        for(int i=0;i < str.length;i++){
            str[i] = sc.next();
        }

        // for(int num : arr){                         //method 1
        //     System.out.println(num);
        // }

        // method 2

        // for(int j=0;j<arr.length;j++){
        //     System.out.println(j);
        // }

        // method 3

        // System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(str));
    }
    
}
