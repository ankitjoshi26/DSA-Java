package BitwiseOp;

public class magicNum {
    public static void main(String[] args) {
        int num = 6;
        int ans = 0;
        int base = 5;
        while (num > 0) {
            int lastDigits = num & 1;
            num = num >> 1;
            ans += lastDigits * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}