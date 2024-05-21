package Recursion;

import java.util.*;

public class index_9 {

    public static boolean searchingElementUsingBinarySearch(int[] arr, int number, int low, int high) {
        if (low > high) {
            return false;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == number) {
            return true;
        } else if (arr[mid] > number) {
            high = mid - 1;
            return searchingElementUsingBinarySearch(arr, number, low, high);
        } else {
            low = mid + 1;
            return searchingElementUsingBinarySearch(arr, number, low, high);
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int element = 2;

        System.out.println(searchingElementUsingBinarySearch(arr, element, 0, arr.length - 1));

    }
}