package BitwiseOp;

public class noOfDigits {
    public static void main(String[] args) {
        int num = 10;
        int base = 10;  // base of the no like binari , decimal
        int ans = (int)(Math.log(num) / Math.log(base)) + 1;
        System.out.println(ans);
    }
    
}
