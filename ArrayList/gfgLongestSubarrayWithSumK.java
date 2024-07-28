package ArrayList;

import java.util.Arrays;

public class gfgLongestSubarrayWithSumK {

    public static boolean sum(int[] arr, int K) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }

        if (ans == K) {
            return true;
        }
        
        return false;
       
    }

    public static int subArray(int[] arr, int N, int K) {

        int max = 0;
        for (int i = 0; i <=arr.length; i++) {

            for (int j = i; j <=arr.length; j++) {

                int[] subArray1 = Arrays.copyOfRange(arr, i, j);
                System.out.println(Arrays.toString(subArray1));

                boolean ans = sum(subArray1, K);
                if (ans == true) {

                    if(subArray1.length>max)
                        max = subArray1.length;
                //  System.out.println(max);
                }
            }
        }
        
        return max;

    }
    
    public static void main(String[] args) {
        
        int[] arr = {8 ,-9, 10 ,-2, -10, 6, 18, 17};


        int N = arr.length;

        int K = 17;

        System.out.println(subArray(arr, N, K));
    }
}
