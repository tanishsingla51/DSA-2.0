package Sorting;

import java.util.*;

public class bubbleSort {

    public static void bubbleSorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapping = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapping = true;
                }
            }
            if (swapping == false) {
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
 
            System.out.println(Arrays.toString(arr));
        
    }

    public static void main(String[] args) {
        int[] arr = {656,76756,66 };

        bubbleSorting(arr);

    }
}
