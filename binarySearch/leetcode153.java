
package binarySearch;


public class leetcode153 {

    public static int minimumInRotatedArray(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid + 1 > nums.length - 1) {

                // return nums[start];
                break;
            } else {

                if (nums[mid] > nums[mid + 1]) {

                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }

        System.out.println(start);
      
        if (start == nums.length - 1) {
            System.out.println(start);

            return nums[0];
        }
        else {
            System.out.println(start);

            return nums[start + 1];
        }

      
    }
    
    public static void main(String[] args) {
        
        int[] nums = {3,1,2};

       System.out.println(minimumInRotatedArray(nums));
    }
}