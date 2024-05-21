package Recursion_Type_2;

import java.util.*;

public class index_1 {

    public static int fibonacci(int n) {
        if (n == 0) { /// positive Base Case
            return 0;
        }

        if (n == 1) { /// positive Base Case
            return 1;
        }

        int chottaAns1 = fibonacci(n - 1); // Recursive Call
        int chottaAns2 = fibonacci(n - 2); // Recursive Call

        return chottaAns1 + chottaAns2; // Small Calculation
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(fibonacci(n));

    }
}
