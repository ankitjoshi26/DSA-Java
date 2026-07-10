package Recursion.permutation;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutation("", "abc");  // for displaying
        // System.out.println(permutationReturn("", "abc")); // for returning ArrayList

    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());

            permutation(first + ch + second, up.substring(1));
        }
    }

    // returning ArrayList :
    static ArrayList<String> permutationReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();    
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>(); // for storing final result

        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());

            ans.addAll(permutationReturn(first + ch + second, up.substring(1)));
        }
        return ans;
    }
}