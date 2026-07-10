package Recursion.Basic;

public class fibonacci {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
    static int fibo(int number){
        if(number < 2){
            return number;
        }
        return fibo(number - 1) + fibo(number - 2);
    }
}
