package ArrayList;

import java.util.Arrays;

public class leetcode75 {

    public static void sort(int[] nums) {

        int noOfZeros = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                noOfZeros++;
            }
        }

        System.out.println(noOfZeros);

        int noOfOnes = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                noOfOnes++;
            }
        }

        System.out.println(noOfOnes);

        int noOfTwos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2) {
                noOfTwos++;
            }
        }

        System.out.println(noOfTwos);

      

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (noOfZeros>zeros) {
                nums[i] = 0;
                zeros++;
            }
        }

        for (int i = zeros; i < nums.length; i++) {

            if (noOfOnes > ones) {
                nums[i] = 1;
                ones++;
            }
        }

        for (int i = zeros+ones; i < nums.length; i++) {

            if (noOfTwos > twos) {
                nums[i] = 2;
                twos++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }



    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0};

        sort(arr);
    }
}
