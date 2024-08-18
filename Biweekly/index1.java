package Biweekly;

import java.util.Arrays;

public class index1 {

    public static int[] resultsArray(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];

        if (k == 1) {
            for (int i = 0; i < ans.length; i++) {
                ans[i] = nums[i];
            }
            return ans;
        }

        for (int i = 0; i < nums.length - k + 1; i++) {
            int[] subarray = Arrays.copyOfRange(nums, i, i + k);
            if (isConsecutive(subarray)) {
                ans[i] = Arrays.stream(subarray).max().getAsInt();
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }

    public static boolean isConsecutive(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 2, 5};
        int k = 3;
        int[] arr = resultsArray(nums, k);
        System.out.println(Arrays.toString(arr));
    }
}