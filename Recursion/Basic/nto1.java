package Recursion.Basic;

public class nto1 {
    public static void main(String[] args) {
       Nto1(5);
       Nto1rev(5);
       Nto1both(5);
    }
    static void Nto1(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        Nto1(num - 1);
    }
    static void Nto1rev(int num){
        if(num == 0){
            return;
        }
        Nto1rev(num - 1);
        System.out.println(num);
    }
    static void Nto1both(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        Nto1both(num - 1);
        System.out.println(num);
    }
}