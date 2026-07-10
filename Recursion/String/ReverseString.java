package Recursion.String;

public class ReverseString {
    public static void main(String[] args) {
        String[] str = {"h", "e", "l", "l", "o"};
        reverseString(str, 0);
    }
    public static void reverseString(String[] str, int index){
        if(index == str.length){
            return;
        }

        reverseString(str, index + 1);
        System.out.println(str[index]);
    }
}
