package binarySearch;

public class leetcode33 {

    public static int search1(int[] nums, int start, int end, int target) {

        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {

                return mid;
            }

            if (isAsc) {

                if (target < nums[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > nums[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

    public static int search(int[] nums, int target) {

        if (nums.length == 1) {
            if (nums[0] == target) {

                return 0;
            } else {
                return -1;
            }
        }
        int starts = 0;
        int end = nums.length - 2;

        while (starts < end) {

            int mid = starts + (end - starts) / 2;

            if (nums[mid] > nums[mid + 1]) {

                end = mid - 1;

            } else {
                starts = mid + 1;
            }
        }

        int start = starts - 1;

        System.out.println(start);

        if (target == nums[start]) {

            return start;

        }

        int newStart1 = 0;
        int end1 = start;

        int ans1 = search1(nums, newStart1, end1, target);

        if (ans1 != -1) {
            return ans1;
        }

        int newStart2 = start + 1;
        int end2 = nums.length - 1;

        int ans2 = search1(nums, newStart2, end2, target);

        if (ans2 != -1) {
            return ans2;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        int target = 4;

        System.out.println(search(nums, target));
    }
}
