package Recursion.Basic;

public class PowOf2 {
    public static void main(String[] args) {
        System.out.println(check(4));
    }
    public static boolean check(int num){
        if(num < 1){
            return false;
        }else if(num == 1){
            return true;
        }
        else{
            while (num % 2 == 0) {
                num = num / 2;
            }
            if(num == 1){
                return true;
            }else{
                return false;
            }
        }
    }
}
