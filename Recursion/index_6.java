package Recursion;

import java.util.*;

public class index_6 {

    public static boolean searchingElement(int[] arr, int number, int i) {
        if (i == arr.length) {
            return false;
        }

        if (arr[i] == number) {
            return true;
        }
        boolean smallOutput = searchingElement(arr, number, i + 1);
        return smallOutput;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int element = 2;

        System.out.println(searchingElement(arr, element, 0));

    }
}
// reverse array using recursion