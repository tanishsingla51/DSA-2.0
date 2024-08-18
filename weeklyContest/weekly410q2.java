package weeklyContest;

public class weekly410q2 {

    public static int countOfPairs(int[] nums) {

        int[] arr1 = new int[nums.length];

        int[] arr2 = new int[nums.length];

        for (int i = 0; i < nums.length-1; i++) {
            
            arr1[i] = 0;
            arr2[i] = nums[i];
          
            while (arr1[i] + arr2[i] == nums[i]) {
                
                System.out.println(arr1[i]+" " + arr2[i]);
            }
        }


        return 1;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 3, 2 };

        countOfPairs(nums);
    }
}
