package BitwiseOp;
public class oddEven {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(isEven(num));
    }
    static boolean isEven(int num){
        return (num & 1) != 1;
    }
}