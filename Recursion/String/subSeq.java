package Recursion.String;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        // subseq("", "abc"); // Method 1 call
        // subseq2("", "abc"); // Method 2 call
        // System.out.println(list); // printing method 2
        System.out.println(subseq3("", "abc")); // Method 3
        // subseqAscii("", "abc");  // Printing ASCII Values
    }
    // Method 1:
    static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed);
            System.out.print("\t"); 
            return;
        }

        char ch = unprocessed.charAt(0);

        subseq(processed + ch, unprocessed.substring(1));  // Include ch
        subseq(processed, unprocessed.substring(1));       // Exclude ch
    }

    // Method 2:
    private static ArrayList<String> list = new ArrayList<>();
    static void subseq2(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            list.add(processed); 
            return;
        }

        char ch = unprocessed.charAt(0);

        subseq2(processed + ch, unprocessed.substring(1));  // Include ch
        subseq2(processed, unprocessed.substring(1));       // Exclude ch
    }

    // Method 3:
    static ArrayList<String> subseq3(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(processed); 
            return list1;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> include = subseq3(processed + ch, unprocessed.substring(1));  // Include ch
        ArrayList<String> exclude = subseq3(processed, unprocessed.substring(1));       // Exclude ch

        include.addAll(exclude);
        return include;
    }

    // ASCII Values:

    static void subseqAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed);
            System.out.print("\t"); 
            return;
        }

        char ch = unprocessed.charAt(0);

        subseqAscii(processed + ch, unprocessed.substring(1));  // Include ch
        subseqAscii(processed, unprocessed.substring(1));       // Exclude ch
        subseqAscii(processed + (ch + 0), unprocessed.substring(1));       // Exclude ch
    }
}