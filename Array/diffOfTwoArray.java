package Array;

import java.util.Scanner;

public class diffOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter size of first array: ");    //3
        int a = sc.nextInt();                   
        int [] arr = new int[a];           
        System.out.println("enter value of first array: ");   //9 9 9
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter size of second array: ");    //4
        int b = sc.nextInt();
        int [] brr = new int[b];
        System.out.println("enter value of second array: ");   // 1 0 0 0
        for(int i=0;i<brr.length;i++){
            brr[i]=sc.nextInt();
        }

        int [] diff = new int[b];          // 4
        int c=0;                                //c=0

        int i= arr.length-1;        // 3
        int j= brr.length-1;          //4
        int k= diff.length-1;       //4

        while (k>=0) {                    //k=4,3
            int d = 0;                    //d=0,1
            int arrval = i>=0?arr[i]:0;       //2>0=9
            if(brr[j]+c>=arrval){             //0+0>=9(X), 0-1>=9(X)
                d = brr[j]+c-arrval;
                c=0;
            }
            else{                       
                d = brr[j]+c+10-arrval;  //0+0+10-9=1,0-1+10-9 = 0
                c = -1;                  //c=-1
            }

            diff[k] = d;         // diff[k] = 001
            i--;                  //3,2,1,0
            j--;                  //4,3,2,1,0
            k--;                  //4,3,2,1,0
        }

        int idx = 0;            //idx=0,1,2,3
        while (idx<diff.length) {    //0<4,1<4,2<4,3<4
            if(diff[idx]==0){        //0==0,0==0,1==0(X)
                idx++;               //idx=1,2,3
            }
            else{
                break;       // break when idx = 3 and value of diff[idx] means (diff[3]) = 1.
            }
        }
            while (idx<diff.length) {      
                System.out.println(diff[idx]);
                idx++;
            }
    }    
}