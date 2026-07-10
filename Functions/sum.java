package Functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
         int ans = sum();
         System.out.println(ans);
        //  sum();
    }   

    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number: ");
        int num2 = sc.nextInt(); 
        // System.out.println("sum is: "+ (num1+num2));
        return (num1+num2);
    }
}