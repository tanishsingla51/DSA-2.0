package recursion_practise;

import java.util.Scanner;

public class index4 {

    public static int firstNaturalNumbers(int n) {

        if (n < 1) {
            return 1;
        }

        int lastDigit = n % 10;

        int ans1 = firstNaturalNumbers(n / 10);
        int ans = lastDigit * ans1;

        return ans;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int value = s.nextInt();

        System.out.println(firstNaturalNumbers(value));
        ;
    }
}