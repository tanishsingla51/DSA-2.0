
package binarySearch;

public class leetcode153Agai {

    public static int minimumInRotatedArray(int[] nums) {

        int max = 0;

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        if (maxIndex == nums.length) {
            return nums[0];
        } else {
            return nums[maxIndex + 1];
        }

    }

    public static void main(String[] args) {

        int[] nums = { 3, 1, 2 };

        System.out.println(minimumInRotatedArray(nums));
    }
}
