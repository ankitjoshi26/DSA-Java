package Array;

import java.util.Scanner;

public class mulitiDimension {
    public static void main(String[] args) {
        // System.out.println();
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[3][3];

        for(int row=0; row < arr.length;row++){
            for(int col=0;col < arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row=0; row < arr.length;row++){
            for(int col=0;col < arr[row].length;col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
    
}




// public class mulitiDimension {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Step 1: Create a jagged array with 3 rows
//         int[][] arr = new int[3][];

//         // Step 2: Specify different column sizes for each row
//         arr[0] = new int[3]; // row 0 has 3 columns
//         arr[1] = new int[2]; // row 1 has 2 columns
//         arr[2] = new int[4]; // row 2 has 4 columns

//         // Step 3: Take input for each row
//         for (int row = 0; row < arr.length; row++) {
//             System.out.println("Enter " + arr[row].length + " numbers for row " + row + ":");
//             for (int col = 0; col < arr[row].length; col++) {
//                 arr[row][col] = sc.nextInt();
//             }
//         }

//         // Step 4: Print the jagged array nicely
//         System.out.println("\nYour jagged array is:");
//         for (int row = 0; row < arr.length; row++) {
//             for (int col = 0; col < arr[row].length; col++) {
//                 System.out.print(arr[row][col] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }