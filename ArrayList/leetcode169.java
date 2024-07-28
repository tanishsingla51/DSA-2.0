package ArrayList;

public class leetcode169 {


    public static int count(int element, int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            if (element == nums[i]) {
                
                temp++;
            }
        }

        return temp;
    }


    public static int majorityElements(int[] nums) {
        
        int max = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            
            int elementsCount = count(nums[i], nums);
            
            if (elementsCount > max) {
                max = elementsCount;
                index = nums[i];

            }
        }

        System.out.println(max);
        return index;
    }
    
    public static void main(String[] args) {
        
        int[] nums = { 3, 2, 3 };

       System.out.println(majorityElements(nums));
    }
}
