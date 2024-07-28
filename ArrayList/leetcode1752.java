package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1752 {

    public static boolean sortedAndRotated(int[] nums) {
        
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
       // System.out.println(Arrays.toString(nums));
 
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        //System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            int freq = 0;

            list.add(list.get(0));
            list.remove(0);
           
            for (int j = 0; j < list.size(); j++) {

                if (list.get(j) == arr[j]) {

                    freq++;
                }
            }
              
            if (freq == list.size()) {
                return true;
            }
        }
       
        
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 1, 2};

        System.out.println(sortedAndRotated(arr));
    }
}