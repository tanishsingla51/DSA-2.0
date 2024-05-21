package Recursion;

import java.util.*;

public class index_2 {

    public static void printNaturalNumbers(int n) {
        if (n == 1) {

            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        printNaturalNumbers(n);

    }
}
