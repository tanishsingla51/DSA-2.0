import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        int [] averages = new int[0] ;
        int [] newnums  = new int[nums.length-2]
        
        int minElement = Arrays.stream(nums).min().orElseThrow(() -> new IllegalArgumentException("Array must not be empty"));
        
        int maxElement = Arrays.stream(nums).max().orElseThrow(() -> new IllegalArgumentException("Array must not be empty"));
        
        for( int i = 0, k=0;i<nums.length;i++){
            
            if( nums[i] == minElement || nums[i] == maxElement){
                
                
                
            }
        }
    }
}