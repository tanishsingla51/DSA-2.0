package leetcodePractise;

import java.util.HashSet;

public class leetcode217 {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            hs.add(nums[i]);
        }
        
        if (hs.size() != nums.length) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        // HashSet<Integer> hs = new HashSet<>();

        // // hs.add(2);
        // // hs.add(3);
        // // hs.add(2);

        // System.out.println(hs);

        int[] nums = { 1, 2, 3};

        System.out.println(containsDuplicate(nums));
    }
}
