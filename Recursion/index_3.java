package Recursion;

import java.util.*;

public class index_3 {

    public static void printNaturalNumbers(int n) {
        if (n == 1) {

            System.out.println(n);
            return;
        }

        printNaturalNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        printNaturalNumbers(n);

    }
}
