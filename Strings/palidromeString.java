package Strings;

public class palidromeString {
    public static void main(String[] args) {
      String str = "abcdcba";
      System.out.println(isPalidrome(str));
    }
    static boolean isPalidrome(String str){
        for(int index=0;index<=str.length()/2;index++){
            str = str.toLowerCase();
            int start = str.charAt(index);
            int end = str.charAt((str.length()-index-1));

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
