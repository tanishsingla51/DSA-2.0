package Biweekly;

import java.util.ArrayList;
import java.util.Arrays;

public class index {

    public static boolean consecutiveArr(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] != nums[i] + 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean consecutive(ArrayList<Integer> list) {

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i+1) != list.get(i) + 1) {
                return false;
            }
        }
        
        return true;
    }

    public static int max(ArrayList<Integer> list) {

        int max = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        
        return max;

    }

    public static int[] resultsArray(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];

        if (k == 1) {
           
            for (int i = 0; i < ans.length; i++) {
                ans[i] = nums[i];
            }
            
            return ans;
        }

        for (int i = 0; i < nums.length-k+1; i++) {

        ArrayList<Integer> list = new ArrayList<>();
            int temp = k;
            
            for (int j = i; j < nums.length; j++) {

                if (temp > 0) {
                    list.add(nums[j]);
                    temp--;
                }
            }

            if (consecutiveArr(nums) == true) {
                ans[i] = max(list);
            }
            else {
                if (consecutive(list) == true) {
                    ans[i] = max(list);
                } else {

                    ans[i] = -1;
                }
            }

           
 
            System.out.println(list);
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,4};

        int k = 1;

        int[] arr = resultsArray(nums, k);
       
        System.out.println(Arrays.toString(arr));

    }
}
