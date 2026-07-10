package NumberSystem;

import java.util.Scanner;

public class numberToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = toDecimal(n,b);
        System.out.println(ans); 
    }
    public static int toDecimal(int n, int b){
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * b;
        }
        return rv;
    }
    
}
