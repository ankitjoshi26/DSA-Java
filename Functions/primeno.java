package Functions;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
    }

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int num = 2;
        while(num <= n/2){
            if(n % num == 0){
                return false;
            }
            num++;
        }
        return num * num > n;
    }
}
