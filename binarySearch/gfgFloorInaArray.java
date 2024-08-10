package binarySearch;

public class  gfgFloorInaArray {
    
    public static int floor(long arr[], int n, long x) {

        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (x < arr[mid]) {

                end = mid - 1;
            }

            else if (arr[mid] == x) {

                return mid;
            }

            else {

                start = mid + 1;
            }
        }

        return end;
    }
    public static void main(String[] args) {
        
        long[] arr = { 1, 2, 8, 10, 11, 12, 19 };

        int n = arr.length;

        long x = 0;
        
        System.out.println(floor(arr, n, x));
    }
}
