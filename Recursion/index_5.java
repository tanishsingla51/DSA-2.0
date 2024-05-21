package Recursion;

import java.util.*;

public class index_5 {

    public static int printArraySum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        int smallOutput = printArraySum(arr, i + 1);
        int meraOutput = arr[i] + smallOutput;
        return meraOutput;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(printArraySum(arr, 0));

    }
}
// reverse array using recursion