package Array;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println();
        System.out.println("enter size of arr: ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.println("enter value of brr: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter size of brr: ");
        int b = sc.nextInt();
        int [] brr = new int[b];
        System.out.println("enter value of brr: ");
        for(int i=0;i<brr.length;i++){
            brr[i]=sc.nextInt();
        }
        int [] sum = new int[a>b?a:b];
        int c=0;

       int i=arr.length-1;
       int j=brr.length-1;
       int k=sum.length-1;

       while (k>=0) {
        int d=c;
        if(i>=0){
            d += arr[i];
        }
        if(j>=0){
            d += brr[j];
        }
        c=d/10;
        d=d%10;

        sum[k] = d;
        i--;
        j--;
        k--;
       }
       if(c!=0){
        System.out.print(c);
       }
        for(int val: sum){
            System.out.print(val);
        }
    }  
}