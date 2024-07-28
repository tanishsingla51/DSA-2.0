package ArrayList;

public class contest1 {

    public static boolean digitGame(int[] nums) {

        int sumOfSingleDigits = 0;

        int sumOfDoubleDigits = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] / 10 == 0) {

                sumOfSingleDigits = sumOfSingleDigits + nums[i];
            } else {

                sumOfDoubleDigits = sumOfDoubleDigits + nums[i];
            }

        }

        if (sumOfSingleDigits == sumOfDoubleDigits) {
            
            return false;
        }
        
        //System.out.println(sumOfSingleDigits+" "+sumOfDoubleDigits);
        
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 14 };

        digitGame(arr);
    }
}
