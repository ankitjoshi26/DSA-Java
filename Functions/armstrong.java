package Functions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isarmstrong(n);
        System.out.println(ans);
    }
    
    static boolean isarmstrong(int n){
        int sum=0;
        int num = n;
        while(num>0){
            int r = num % 10;
            sum = sum + (r*r*r);
            num = num / 10;
        }
        if (sum == n){
            return true;
        }
        else{
            return false;
        }
    }
}