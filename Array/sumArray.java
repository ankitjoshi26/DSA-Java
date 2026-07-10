package Array;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter size of array: ");
        int s = sc.nextInt();
        int [] arr = new int[s];
        System.out.println("enter values: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i]; 
        }
        System.out.println(sum);
    }
}