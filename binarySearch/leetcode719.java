package binarySearch;

public class leetcode719 {

    public static int smallestDistancePair(int[] nums, int k) {

        for (int i = 0; i < nums.length;i++){
            for (int j = i; j < nums.length; j++) {

                System.out.println(nums[i]+" "+nums[j]);
            }
        }
        
        return 1;
    }

     public static void main(String[] args) {

        int[] nums = { 1, 6, 1 };

        int k = 3;

        smallestDistancePair(nums, k);
    }
}