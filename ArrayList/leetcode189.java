package ArrayList;

import java.util.Arrays;

public class leetcode189 {

    public static void rotateArray(int[] nums, int k) {
        
        // for (int j = 0; j <1; j++) {
            
            int lastTerm = nums[nums.length-k];

            for (int i = nums.length - 1; i > k; i--) {

                nums[i] = nums[i - k];

            }
            
            for (int i = 0; i <=k; k++)
            {
                nums[i] = lastTerm;
            }

          
        // }

        System.out.println(Arrays.toString(nums));
    }
    
    public static void main(String[] args) {
        
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 3;

        rotateArray(nums,k);
    }
}