package BinarySearch;

public class rotationCount {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr){
        int pivot = findRotation(arr);

        return pivot + 1;
    }

    // use this for non-duplicates =>
    static int findRotation(int[] arr){
         int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid =  start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        } 
        return -1;
    }

    //use this for duplicates =>

    static int findRotationWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Case 1: Pivot mil gaya
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        // Case 2: Pivot mid ke just pehle hai
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        // Case 3: Duplicates handle karna
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

            // Check start wala pivot hai kya
            if (arr[start] > arr[start + 1]) {
                return start;
            }
            start++;

            // Check end wala pivot hai kya
            if (arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        }
        // Case 4: Left sorted hai OR left equal but right bada hai
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        }
        // Case 5: Otherwise, pivot right side me hai
        else {
            end = mid - 1;
        }
    }
    return -1;
 }
}