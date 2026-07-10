package Array;

import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args) {
        int [] arr = {
            1788,2232,1782,1122,9932,1828,1654
        };
        String [] brr = {
            "java","python","c","c++","javascript"
        };

       Arrays.sort(arr);
       System.out.println("sorted numeric array: "+ Arrays.toString(arr));

       Arrays.sort(brr);
       System.out.println("sorted alphabatic array: "+ Arrays.toString(brr));
    }   
}