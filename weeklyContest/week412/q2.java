package weeklyContest.week412;

import java.util.Arrays;

public class q2 {

    public static int compare(int[] digits, int[] nums) {

        int number = 0;

        // Iterate through the array and construct the integer
        for (int digit : digits) {

            number = number * 10 + digit;
        }
                                        
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (number == nums[i]) {

                count++;
            }
        }
        return count;
    }

    public static int swap(int n, int[] nums) {
        
        String numberStr = Integer.toString(n);

        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        int[] digit = digits;

        int i = 0;
        int j = digits.length - 1;

        while(i < j) {
            
            int temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;

            int temp2 = compare(digits, nums);
            
            if (j == 1) {
                i++;
                j = digits.length - 1;
            }
            System.out.println(Arrays.toString(digits));
            digits = digit;

            j--;
            
        }

        return 1;
    }

    public static int countPairs(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] / 10 > 0) {

                System.out.println(nums[i]);
                int count = swap(nums[i],nums);
                ans=ans+count;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 123,231 };

        System.out.println(countPairs(nums));

        
    }
}
