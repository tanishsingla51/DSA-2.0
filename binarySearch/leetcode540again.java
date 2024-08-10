package binarySearch;

public class leetcode540again {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {

                end = mid - 1;
            }

            else if (nums[mid] == target) {

                return target;
            }

            else {

                start = mid + 1;
            }
        }

        return -1;

    }
    
    public static int singleNonDuplicate(int[] nums) {

        int i = 0;
        while (i < nums.length ) {
            
            int ans2 = 0;
            if (i + 1 > nums.length - 1) {
                ans2 = -1;
            }
            else {
                 ans2 = search(nums, nums[i + 1]);
            }

            int ans1 = search(nums, nums[i]);
            
            System.out.println(ans1);
            System.out.println(ans2);
           
            

            if (ans1 != ans2) {
                return nums[i];
            }
            i = i + 2;
        }

        return 3;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,2};

        System.out.println(singleNonDuplicate(nums));
    }
}
