public class CircularPrime {
    public static void main(String[] args){
        int num = 24;
        int n = num;
        // count number of digits
        int count = 0;
        while(n > 0){
            count++;
            n/=10;
        }

        boolean flag = true;
        for(int i=0; i<count;i++){
            if(!isCircularPrime(num)){
                flag = false;
                break;
            }
            int r = num % 10;
            num /= 10;
            num = r * (int)Math.pow(10, count - 1) + num;
        }

        if(flag){
            System.out.println("Number is Circular prime");
        }else{
            System.out.println("Number is not a Circular prime");
        }
    }
    static boolean isCircularPrime(int num){
        for(int i=2;i<num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }    
}
