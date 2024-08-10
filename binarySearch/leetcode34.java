package binarySearch;

import java.util.Arrays;

public class leetcode34 {
    
    public static int[] firstAndLastPosition(int[] nums,int target){


        int start =0;
        int end = nums.length - 1;
        
        while (start < end) {
            
            int mid = end + (start - end) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return new int[]{start,end};
    }
    public static void main(String[] args) {
        
        int[] arr = { 5, 7, 7, 8, 8, 10 };

        int target = 8;

        int[] ans = firstAndLastPosition(arr, target);
       
        System.out.println(Arrays.toString(ans));
    }
}
