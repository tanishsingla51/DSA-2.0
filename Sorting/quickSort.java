package Sorting;

import java.util.Arrays;

public class quickSort {

    public static void quickSorting(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            // else {
            i++;
            // }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = { 5, 3, 2, 1, 4 };

        quickSorting(arr);
    }
}
