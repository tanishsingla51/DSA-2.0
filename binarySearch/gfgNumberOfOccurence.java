package binarySearch;

public class gfgNumberOfOccurence {

    public static int numberOfOccurence(int[] arr, int n, int x) {
        
        int start = 0;
        int end = n - 1;

        int count = 0;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (x < arr[mid]) {

                end = mid - 1;
            }

            else if (arr[mid] == x) {

              //  System.out.println(count);
              count++;
             // return mid;
            }

            else {

                start = mid + 1;
            }
        }

        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };

        int N = arr.length;

        int X = 2;

        System.out.println(numberOfOccurence(arr, N, X));
    }
}
