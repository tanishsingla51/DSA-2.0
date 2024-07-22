package Sorting;

public class leetcode268 {

    public static int missingNumbers(int[] arr) {

        int ans = 0;
        int ans1 = 787876;

        for (int i = 0; i <= arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i == arr[j]) {
                    ans = i;
                }
            }

            if (ans1 == ans) {
                return ans + 1;
            }

            ans1 = ans;
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = { 9, 6, 4, 2, 3, 5, 0, 8, 1 };

       System.out.println( missingNumbers(arr));
    }
}
