package Functions;

public class greet {
    public static void main(String[] args) {
        System.out.println();
        String message = greet("Ankit Joshi");
        System.out.println(message);
    }

    static String greet(String name){
        return "hello " + name;
    }
   
}
