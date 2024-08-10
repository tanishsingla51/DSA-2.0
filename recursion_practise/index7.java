package recursion_practise;

import java.util.Scanner;

public class index7 {


    public static void numberOfZeros(int num) {

        int zeros = 0;

        if (num < 1) {
            return;
        }

        int lastDigit = num % 10;

        if (lastDigit == 0) {
            zeros++;
        }

        numberOfZeros(num / 10);

        return zeros;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       System.out.print(numberOfZeros(n));
    }
}
