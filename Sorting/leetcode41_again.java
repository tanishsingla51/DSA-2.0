package Sorting;

import java.util.Arrays;

public class leetcode41_again {

    public static int smallestPositiveInteger(int[] nums) {

    

        int i = 0;
        while (i < nums.length) {

            int correctIndex = nums[i]-1;
            if (correctIndex>=0 && correctIndex<nums.length && nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        int j = 0;
       while(j<nums.length) {
            
           if (j + 1 != nums[j]) {

               return j + 1;
           }
           j++;
        }
        
            return j+1;
        
    }
    
    public static void main(String[] args) {

        int[] arr = { 1, 2, 0};

        System.out.println(smallestPositiveInteger(arr));

    }
}
