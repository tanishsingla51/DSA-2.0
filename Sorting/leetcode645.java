package Sorting;

import java.util.Arrays;

public class leetcode645 {

    public static int[] setMismatch(int[] nums) {

        int i = 0;
        while (i < nums.length) {

            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        int[] ans = new int[2];


        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {

                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {

        int[] nums = { 1, 1};

        int[] ans = setMismatch(nums);
       
        for (int i = 0; i < ans.length; i++) {
            
            System.out.print(ans[i]+" ");
        }
    }
}
