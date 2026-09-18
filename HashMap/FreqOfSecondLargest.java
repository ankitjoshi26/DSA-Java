import java.util.HashMap;

public class FreqOfSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 30, 30 };

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int max = 0;
        int smax = 0;
        for (int num : arr) {
            if(num > max){
                smax = max;
                max = num;
            }else if(num > smax && num < max){
                smax = num;
            }
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(smax);
        System.out.println(freqMap.get(smax));
    }
}