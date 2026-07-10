package Complexity.Time;

public class fibonacci {
    public static void main(String[] args) {
        // for(int i=0;i<11;i++){
        //     System.out.println(findFibo(i));
        // } 

        System.out.println(findFibo(11));
    }
    static int findFibo(int n){
        // return (int)((Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n)) / Math.sqrt(5)); 

        // removing less dominating terms from above formula:
        return (int)(Math.pow(((1 + Math.sqrt(5))/2), n) / Math.sqrt(5));
    }
}