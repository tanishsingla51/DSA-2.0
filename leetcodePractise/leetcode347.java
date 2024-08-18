package leetcodePractise;

public class leetcode347 {

    public static void topKFrequent(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            int freq = 0;

            // if (i==nums.length-1 || nums[i] != nums[i + 1] || i==0) {

            for (int j = i; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    freq++;
                }

            }
            // }

            System.out.println(freq);

        }

    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };

        int k = 2;

        topKFrequent(nums, k);
    }
}
