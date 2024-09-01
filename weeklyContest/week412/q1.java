package weeklyContest.week412;

import java.util.Arrays;

public class q1 {

    public static int min(int[] nums) {

        int minV = 20000000;
        int minIndex = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] <= minV) {
                minV = nums[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 1; i <= k; i++) {

            int minIndex = min(nums);

            System.out.println(minIndex);

            nums[minIndex] = nums[minIndex] * multiplier;

        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2 };

        int k = 3;

        int n = 4;

        int[] ans = getFinalState(nums, k, n);

        System.out.println(Arrays.toString(ans));
    }
}
