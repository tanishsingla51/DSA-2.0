package Recursion_Type_2;

import java.util.*;

public class index_3 {

    public static void combination(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        combination(n - 1, ans + "H");
        combination(n - 1, ans + "T");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 3;

        combination(n, "");
    }
}
