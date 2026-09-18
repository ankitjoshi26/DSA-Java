import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,4,5,6,33};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }
}
