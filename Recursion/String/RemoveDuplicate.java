package Recursion.String;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str ="aaaaabbbbb";
        System.out.println(remove(" ",str));
    }
    public static String remove(String p, String up){
        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);

        if(p.isEmpty() || p.charAt(p.length() - 1) != ch){
            return remove(p + ch, up.substring(1));
         }else{
            return remove(p, up.substring(1));
         }
    } 
}