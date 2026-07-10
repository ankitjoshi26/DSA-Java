package Recursion.Basic;

public class sumOfDigits {
    public static void main(String[] args) {
        int digits = 12345;
        System.out.println(sum(digits));
    }
    static int sum(int num){
        if(num == 1){
            return 1;
        }
        return (num % 10) + sum(num / 10);
    }
}
