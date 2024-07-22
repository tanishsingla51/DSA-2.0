package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode448 {

    public static List<Integer> missing(int[] nums) {

        ArrayList<Integer> list = new ArrayList();

        for (int j = 1; j <= nums.length; j++) {
            // System.out.println(nums.length);
            int freq = 0;
            for (int k = 0; k < nums.length; k++) {

                if (j == nums[k]) {
                    freq++;
                }
                if (freq > 1) {

                    list.add(k);
                }
            }

        }
        return list;
    }

    public static void missingNumbersInArray(int[] nums) {

        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;

            if ( nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(missing(nums));

    }

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        missingNumbersInArray(arr);

    }
}
