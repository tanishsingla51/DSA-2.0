package ArrayList;

public class leetcode485 {

    public static int consecutiveOnes(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int noOfZeros=0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                noOfZeros++;
            }
        }
      //  System.out.println(noOfZeros);
        
        if (noOfZeros == nums.length) {
            return 0;
        }
        

        int maxConsecutive = 0;

        int noOfOnes = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 1 && nums[i] == nums[i + 1]) {
                noOfOnes++;
                // maxConsecutive = noOfOnes+1;
            } else {
                noOfOnes = 0;
            }

           // System.out.println(noOfOnes);

            if (noOfOnes > maxConsecutive) {
              // System.out.println("ggvjhgj");
                maxConsecutive = noOfOnes;
            }
        }

     //   System.out.println(maxConsecutive);

        return maxConsecutive+1;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {0,0};

        System.out.println(consecutiveOnes(arr));
    }
}
