package Recursion;

import java.util.*;

public class index_8 {

    public static void reverseArray(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        reverseArray(arr, i + 1, j - 1);

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        reverseArray(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
// reverse array using recursion