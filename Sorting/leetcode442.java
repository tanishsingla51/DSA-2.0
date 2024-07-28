package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode442 {

    public static List<Integer> duplicatesInArray(int[] nums) {

         int i = 0;
         while (i < nums.length) {

             int correctIndex = nums[i]-1;
             if (nums[i] != nums[correctIndex]) {

                 int temp = nums[i];
                 nums[i] = nums[correctIndex];
                 nums[correctIndex] = temp;
             } else {
                 i++;
             }
         }
        
         System.out.println(Arrays.toString(nums));
        
         ArrayList<Integer> list = new ArrayList<>();
        
         for (int j = 0; j < nums.length; j++) {
            
             if (nums[j] != j + 1) {
                
                 list.add(nums[j]);
            }
         }

         Collections.sort(list);

        return list;
    }
    
    public static void main(String[] args) {

        int[] arr = {1,1,2};

       System.out.println( duplicatesInArray(arr));

    }
}