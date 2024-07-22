package Sorting;

import java.util.Arrays;

public class selectionSort {

    public static void selectionSorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxElement = max(arr, 0, last);

            int temp = arr[maxElement];
            arr[maxElement] = arr[last];
            arr[last] = temp;
        }

         System.out.println(Arrays.toString(arr));

    }

    public static int max(int[] arr, int start, int last) {
        int maxIndex = 0;

        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;

    }

    public static void main(String[] args) {
        int[] arr = { 96, 7456, 66 };

        selectionSorting(arr);

    }
}
