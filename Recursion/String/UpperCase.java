package Recursion.String;

public class UpperCase {
    public static void main(String[] args) {
        String str = "gees";
        char res = findUpperCase(str, 0);
        if(res == 0){
            System.out.println("No Upper Case Letter");
        }else{
            System.out.println(res);
        }
    }
    public static char findUpperCase(String str, int i){
        if(i == str.length()){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }

        return findUpperCase(str, i + 1);
    }
}
