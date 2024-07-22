package Sorting;

import java.util.Arrays;

public class leetcode287 {

    public static int duplicateNumber(int[] nums) {

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

        for (int j = 0; j < nums.length - 1; j++) {

            if (nums[j] == nums[nums.length - 1]) {
                System.out.println(nums[j]);
                return nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 4, 3, 1, 4, 2 };

        System.out.println(duplicateNumber(nums));
    }
}