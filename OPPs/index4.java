public class index4 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                temp++;
            } else {
                temp = 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
