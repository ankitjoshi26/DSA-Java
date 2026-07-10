package Array;

import java.util.Scanner;

public class gridPrinting {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println();
        int [] [] a = new int[10][10];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("-", a[i][j]);
            }
            System.out.println();
        }
    }
    
}
