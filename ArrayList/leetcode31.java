package ArrayList;

import java.util.Arrays;

public class leetcode31 {
    
    public static void permutation(int[] nums) {

        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {

            sum = sum*10 + nums[i];
      
       }
       System.out.println(sum);

          //  for (int j = 1; j < nums.length - 1; j++) {

                int temp = nums[nums.length - 2];
                nums[nums.length - 2] = nums[nums.length - 1];
                nums[nums.length - 1] = temp;

         //   }

            int sum1 = 0;

            for (int i = 0; i < nums.length; i++) {

                sum1 = sum1*10 + nums[i];

            }
          System.out.println(sum1);

            if (sum1 > sum) {
                System.out.println(Arrays.toString(nums));
                return;
            }
            else {

                int i = 0;
                while (i < nums.length) {

                    int correctIndex = nums[i] - 1;
                    if (nums[i] != nums[correctIndex]) {

                        int temp1 = nums[i];
                        nums[i] = nums[correctIndex];
                        nums[correctIndex] = temp1;
                    }
                    // else {
                    i++;
                    // }
                }

                System.out.println(Arrays.toString(nums));
                return;
            }

           
    
        
     
    }
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3};

        permutation(arr);
    }
}
