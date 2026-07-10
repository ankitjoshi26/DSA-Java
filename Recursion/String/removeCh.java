package Recursion.String;

import java.lang.reflect.Method;

public class removeCh {
    public static void main(String[] args) {
        skip("", "bccaasdah"); //Method 1
        System.out.println(skip2("bacad")); // Method 2
    }
    static void skip(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }else{
            skip(processed + ch, unprocessed.substring(1));
        }
    }
    static String skip2(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
           return skip2(unprocessed.substring(1));
        }else{
           return ch + skip2(unprocessed.substring(1));
        }
    }
}