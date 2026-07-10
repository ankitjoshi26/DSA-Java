package Pattern;

public class alpha1 {
    public static void main(String[] args) {
        System.out.println();
        int n=5;
        for(int i=1;i<=n;i++){
            char ch = (char)('E'-i+1);  
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}