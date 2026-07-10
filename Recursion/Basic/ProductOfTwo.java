package Recursion.Basic;

public class ProductOfTwo {
    public static void main(String[] args) {
        System.out.println(product(4,5));
    }
    public static int product(int a, int b){
        if(b == 0){
            return 0;
        }
        return a + product(a, b-1);
    }
}
