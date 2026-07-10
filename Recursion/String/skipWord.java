package Recursion.String;

public class skipWord {
    public static void main(String[] args) {
        System.out.println(skipWord("bcpapplegf"));        
    }
    static String skipWord(String unProcessed){
        if(unProcessed.isEmpty()){
            return "";
        }

        if(unProcessed.startsWith("apple")){
            return skipWord(unProcessed.substring(5));
        }else{
            return unProcessed.charAt(0) + skipWord(unProcessed.substring(1));
        }
    }
}