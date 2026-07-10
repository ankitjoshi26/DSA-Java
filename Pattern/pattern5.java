package Pattern;

public class pattern5 {
    public static void main(String[] args) {
        // p1(5);
        p2(5);
        // p5(5);
    }

    static void p1(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p2(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p5(int num){
        for(int i = 0; i < num*2; i++){
          int stars = (i<=num)? i : num * 2 - i;
            for(int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}