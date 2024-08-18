package weeklyContest.week411;

import java.util.*;

public class index3 {

    public static boolean palindrome(int number) {
        int reversed = 0;
        int original = number;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number/ 10;
        }
        return original == reversed;
    }

    public static int end(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum * 10 + 9;
        }

        // System.out.println(sum);
        return sum;
    }

    public static int start(int n) {

        // System.out.println(Math.pow(10, n - 1) + 1);
        return (int) Math.pow(10, n - 1) + 1;
    }

    public static String largestPalindrome(int n, int k) {

        int ans = 0;
        int temp = 0;
        for (int i = start(n); i <= end(n); i++) {

            // System.out.println(i);
            if (palindrome(i) == true && i % k == 0) {

                ans = i;

                if (ans > temp) {
                    temp = ans;
                }y
            }

        }

        return String.valueOf(temp);
    }

    public static void main(String[] args) {

        int n = 3;

        int k = 5;

        System.out.println(largestPalindrome(n, k));

    }
}
