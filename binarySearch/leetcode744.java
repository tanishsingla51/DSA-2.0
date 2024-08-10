package binarySearch;

public class leetcode744 {

    public static char smallestLetterGreaterThanTarget(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = (start + (end - start) / 2);

            // System.out.println(mid);

            if (target < letters[mid]) {
                end = mid - 1;
                
            }

            else {
                start = mid + 1;
            }
        }

        return letters[start%letters.length];
    }

    public static void main(String[] args) {

        char[] arr = { 'x', 'x', 'y', 'y' };

        char target = 'z';

        System.out.println(smallestLetterGreaterThanTarget(arr, target));
        ;
    }
}
