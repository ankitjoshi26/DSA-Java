package Recursion.Basic;

public class checkZero {
    public static void main(String[] args) {
        int num = 30102;
        System.out.println(count(num));
    }
    static int count(int num){
        return helper(num, 0);
    }
    private static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            return helper(num / 10, count+1);
        }
        return helper(num / 10, count);
    }
}
