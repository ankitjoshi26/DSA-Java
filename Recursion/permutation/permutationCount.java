package Recursion.permutation;

public class permutationCount {
    public static void main(String[] args) {
        // System.out.println(permutationcount("", "abc"));
        System.out.println(permutationCount2("", "abc", 0));
    }
    static int permutationcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count  = 0;
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = count + permutationcount(first + ch + second, up.substring(1));
        }
        return count;
    }
    //  Passing count as a argument: 

    static int permutationCount2(String p, String up, int count){
        if(up.isEmpty()){
            return count + 1;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = permutationCount2(first + ch + second, up.substring(1), count);
        }
        return count;
    }
}