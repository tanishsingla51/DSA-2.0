package ArrayList;

import java.util.Arrays;

public class leetcode25 {

    public static int removeDuplicates(int[] nums) {

        int length = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != -1) {
                length++;
            }
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    nums[j] = -1;
                    //duplicates++;
                }
            }
        }

         System.out.println(Arrays.toString(nums));

        int[] ans = new int[length + 1];
        
        int j = 0;
        while(j<ans.length) {
            
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] != -1) {

                    ans[j] = nums[i];
                    j++;
                }
            }
        }

        
        
   //     System.out.println(Arrays.toString(ans));

        
     
      //  System.out.println(length+1);
        return length+1;
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        removeDuplicates(arr);
    }
}
