package ArrayList;

import java.util.Arrays;

public class leetcode283 {

    public static void moveZeros(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                if (nums[j] != 0) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] arr = {0};

        moveZeros(arr);
    }
}