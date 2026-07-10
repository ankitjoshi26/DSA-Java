package Pattern;

public class patternPrinting {
    public static void main(String[] args) {
        int n = 5;
        squarePattern(n);
        printingPattern1(n); 
        printingPattern2(n); 
        printingPattern3(n); 
        printingPattern4(n);  
        printingPattern5(n);  
        printingPattern6(n);  
        printingPattern7(n);  
        // System.out.println(n)
    }
    static void printingPattern1(int n){
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void squarePattern(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printingPattern2(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printingPattern3(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void printingPattern4(int n){
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // move to next line
        }

        // lower half
       for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printingPattern5(int n){
        System.out.println();
        for(int i=1;i<=2*n-1;i++){
            int noOfColumn = i > n ? 2*n-i : i; 
            int noOfSpaces = n-noOfColumn;
            for(int S=1;S<=noOfSpaces;S++){
                System.out.print(" ");
            }
            for(int j=1;j<=noOfColumn;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printingPattern6(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
            System.out.print("  ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
    static void printingPattern7(int n){
        System.out.println();
        for(int i=1;i<=2*n;i++){
        int c = i>n ? 2*n-i : i;
        for(int spaces=0;spaces<n-c;spaces++){
            System.out.print("  ");
        }
        for(int j=c;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=c;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}
