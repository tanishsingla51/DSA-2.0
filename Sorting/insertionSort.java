package Sorting;

import java.util.Arrays;

public class insertionSort {

    public static void insertionSorting(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {

                if (arr[j - 1] > arr[j]) {

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
           
        // }
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 5, 4, 3, 1, 2 };

        insertionSorting(arr);
    }
}
