package Recursion.Basic;

public class reverseNum {
    public static void main(String[] args) {
        int num = 3465;
        System.out.println(reverse(num));
    }

    static int reverse(int num) {
        int digits = (int) (Math.log10(num));
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }

        int rem = num % 10;
        return rem * (int)(Math.pow(10, digits)) + helper(num / 10, digits - 1);
    }
}
