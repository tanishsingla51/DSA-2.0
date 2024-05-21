package Recursion;

import java.util.*;

public class index_7 {

    public static void sortingArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }

        sortingArray(arr, i + 1);

        for (int j = 0; j < i; j++) {
            if (arr[j] < arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        System.out.print(arr[i] + " ");

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 3, 5 };

        sortingArray(arr, 0);

    }
}
// reverse array using recursion