package weeklyContest.week412;

public class q2_again {

    // Count occurrences of 'n' in nums array up to index
    public static int pairs(int n, int[] nums, int index) {
        int count = 0;
        for (int i = 0; i <= index; i++) {
            if (n == nums[i]) {
                count++;
            }
        }
        return count;
    }

    // Generate all possible swaps of digits in 'n' and check how many exist in nums
    public static int swap(int n, int[] nums, int index) {
        int ans = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String swappedStr = swapChars(str, i, j);
                int swappedNum = Integer.parseInt(swappedStr);

                ans += pairs(swappedNum, nums, index);
            }
        }
        return ans;
    }

    // Swap characters at positions i and j in a string
    public static String swapChars(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    // Main function to count all pairs that are equal or can become equal by
    // swapping digits
    public static int countPairs(int[] nums) {
        int ans = 0;

        // Count pairs of identical numbers directly
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }

        // Count pairs that can be made equal by swapping digits
        for (int i = 0; i < nums.length; i++) {
            ans += swap(nums[i], nums, i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 12, 8, 5, 5, 1, 20, 3, 10, 10, 5, 5, 5, 5, 1 };
        System.out.println(countPairs(nums)); // Output the total number of pairs
    }
}
