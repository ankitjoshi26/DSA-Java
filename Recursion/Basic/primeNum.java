package Recursion.Basic;

public class primeNum {
    public static void main(String[] args) {
        int num = 1;
        if (check(num, 2)) {
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
    public static boolean check(int num,int i){
        if(num <= 2){
            return (num ==2)? true:false;
        }

        if(i * i > num){
            return true;
        }

        if(num % i == 0){
            return false;
        }

        return check(num, i+1);
    }
}