package Functions;

public class varargs {
    public static void main(String[] args) {
        // System.out.println();
        printNumbers(1,2,3);
        printNumbers(10,20);
        printNumbers();
    }
    
    static void printNumbers(int... num){
         System.out.print("Numbers: ");
         for(int i:num){
            System.out.println(i + " ");
         }
    }

}
