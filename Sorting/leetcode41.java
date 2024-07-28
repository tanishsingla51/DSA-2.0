package Sorting;

import java.util.Arrays;

public class leetcode41 {

    public static int smallestPositiveInteger(int[] nums) {


        int[] arr = new int[nums.length];
        
        for (int i = 0; i < arr.length; i++) {

            arr[i] = i + 1;
        }
        
        System.out.println(Arrays.toString(arr));

       

        for (int i = 0; i < arr.length; i++) {
            int freq = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == nums[j]) {
                   // System.out.println(arr[i]);
                    freq++;
                }
               // System.out.println(freq);
            }
            if (freq == 0) {
                return arr[i];
            }
        }
        
        return 0;
    }
    
    public static void main(String[] args) {

        int[] arr = {1};

        System.out.println(smallestPositiveInteger(arr));

    }
}
