package Recursion.Basic;

public class productOfDigits {
    public static void main(String[] args) {
        int digits = 12304;
        System.out.println(product(digits));
    }
    static int product(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
