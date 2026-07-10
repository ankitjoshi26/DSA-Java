package Pattern;

public class Pattern1{
    public static void main(String[] args){
        int n = 5;
        System.out.println();
        printPattern(n);
    }

    public static void printPattern(int n){
        for(int i = 0 ; i<n;i++){

            for(int spaces = 0;spaces<i;spaces++){
                System.out.print(" ");
            }

            for(int j=n-i; j>0;j--){
                System.out.print("* ");
            }

            System.out.println();

        }
        for(int i = 0; i < n; i++) {
            for(int spaces = n - i - 1; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}