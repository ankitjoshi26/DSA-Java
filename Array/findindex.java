package Array;

import java.util.Scanner;

public class findindex {
    public static void main(String[] args) {
        int arr []= {20,34,22,11,8};
        System.out.println();
        System.out.println("enter any number to find there index: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("number is not available in array");
        }
    }   
}