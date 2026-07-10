package Recursion.String;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "abcd";
        // System.out.println(findLenght(str, 0));
        System.out.println(findLenght2(str));
    }
    public static int findLenght(String up, int count){
        if(up.isEmpty()){
            return count;
        }

        return findLenght(up.substring(1), count + 1);
    }

    // Method 2:
    public static int findLenght2(String str){
        if(str.equals("")){
            return 0;
        }
        return findLenght2(str.substring(1)) + 1;
    }
}