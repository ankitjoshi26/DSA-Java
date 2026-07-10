package Array;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter " + size + " values:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        double average = sum/size;
        System.out.println(average);
    }
    
}
