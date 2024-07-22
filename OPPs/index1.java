// You have an array of floating point numbers averages which is initially
// empty. You are given an array nums of n integers where n is even.

// You repeat the following procedure n / 2 times:

// Remove the smallest element, minElement, and the largest element maxElement,
// from nums.
// Add (minElement + maxElement) / 2 to averages.
// Return the minimum element in averages.

// Example 1:

// Input: nums = [7,8,3,4,15,13,4,1]

// Output: 5.5

// Explanation:

// step nums averages
// 0 [7,8,3,4,15,13,4,1] []
// 1 [7,8,3,4,13,4] [8]
// 2 [7,8,4,4] [8,8]
// 3 [7,4] [8,8,6]
// 4 [] [8,8,6,5.5]The smallest element of averages, 5.5, is returned.

// code for the above solution is:

import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        int [] averages = new int[0] ;
        int [] newnums  = new int[nums.length-2]
        
        int minElement = Arrays.stream(nums).min().orElseThrow(() -> new IllegalArgumentException("Array must not be empty"));
        
        int maxElement = Arrays.stream(nums).max().orElseThrow(() -> new IllegalArgumentException("Array must not be empty"));
        
        for( int i = 0, k=0;i<nums.length;i++){
            
            if( nums[i] == minElement || nums[i] == maxElement){
                
                continue;
            }
            else{
                newnums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newnums));
    }
}
