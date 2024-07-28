package ArrayList;

import java.util.Arrays;

public class leetcode2149 {

    public static int[] rearrange(int[] nums) {

        int[] ans = new int[nums.length/2];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {

                ans[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(ans));

        int[] ans1 = new int[nums.length / 2];
        
        int index1 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {

                ans1[index1] = nums[i];
                index1++;
            }
        }

        System.out.println(Arrays.toString(ans1));

        int[] answer = new int[nums.length];
        
        for (int i = 0; i < answer.length; i++) {

            if (i % 2 == 0) {

                answer[i] = ans[i / 2];

            }
            else {
                
                answer[i] = ans1[i / 2];
            }
            
        }

        System.out.println(Arrays.toString(answer));
         
       return answer;
    }

    

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };

        System.out.println(rearrange(arr));
    }
}
