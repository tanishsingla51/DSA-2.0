package binarySearch;

public class leetcode852 {
    
    public static int peakInMountainArray(int[] arr) {

        int start = 0;
        int end =arr.length-2;


        while (start <= end) {
            
            int mid = end + (start - end) / 2;
            
            if ( arr[mid] > arr[mid + 1] ) {

                end = mid - 1;
                
            }
            else {
                start = mid + 1;
            }
        }
        
        return start;
    }
    public static void main(String[] args) {
        
        int[] arr = { 0, 3, 5, 12, 2};
        
       System.out.println(peakInMountainArray(arr));
    }
}
