package Recursion;

import java.util.*;

public class index_10 {

    public static int power(int base, int n) {
        if (n == 0) { /// positive Base Case
            return 1;
        }

        int smallOutput = power(base, n - 1);
        return base * smallOutput;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(power(2, n));

    }
}