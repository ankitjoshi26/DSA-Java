package Strings;

public class stringMethods {
    public static void main(String[] args) {
        System.out.println(length("ankit"));
        System.out.println(toLowerCase("ANkit"));
        System.out.println(toUpperCase("ankit"));
        System.out.println(trimString("         Ankit Joshi        "));
        System.out.println(subString1("Ankit"));
        System.out.println(subString2("Ankit"));
        System.out.println(replace("Ankit"));
        System.out.println(startWith("Ankit"));
        System.out.println(endWith("Ankit"));
        System.out.println(charAt("Ankit"));
        System.out.println(indexOf1("Ankit"));
        System.out.println(indexOf2("Ankit")); 
        System.out.println(lastIndexOf1("Ankit"));   
        System.out.println(lastIndexOf2("Ankit"));   
        System.out.println(equals("Ankit"));     
        System.out.println(equals2("Ankit"));     
    }
    static int length(String str){
        return str.length();
    }
    static String toLowerCase(String str){
        return str.toLowerCase();
    }
    static String toUpperCase(String str){
        return str.toUpperCase();
    }
    static String trimString(String str){
        return str.trim();
    }
    static String subString1(String str){
        return str.substring(3);
    }
    static String subString2(String str){
        return str.substring(1,3);
    }
    static String replace(String str){
        return str.replace("it", "u");
    }
    static boolean startWith(String str){
        return str.startsWith("An");
        // return str.startsWith("n");
    }
    static boolean endWith(String str){
        return str.endsWith("it");
        // return str.endsWith("i");
    }
    static char charAt(String str){
        return str.charAt(3);
    }
    static int indexOf1(String str){
        return str.indexOf("An");
    }
    static String indexOf2(String str){
        int idx = str.indexOf("t", 1);
        return String.valueOf(idx); 
    }
    static int lastIndexOf1(String str){
        return str.lastIndexOf("ki");
    }
    static int lastIndexOf2(String str){
        return str.lastIndexOf("n",3);
    }
    static boolean equals(String str){
        return str.equals("Ankit");
    }
    static boolean equals2(String str){
        return str.equalsIgnoreCase("ankit");
    }
}