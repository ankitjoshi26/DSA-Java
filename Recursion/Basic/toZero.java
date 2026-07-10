package Recursion.Basic;

public class toZero {
    public static void main(String[] args) {
        System.out.println(checkSteps(14,0));
    }
    public static int checkSteps(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return checkSteps(num / 2, count + 1);
        }
        return checkSteps(num - 1, count + 1);        
    }
}
