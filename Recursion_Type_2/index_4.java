package Recursion_Type_2;

import java.util.*;

public class index_4 {

    public static void combination(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        combination(n - 1, ans + "0");
        combination(n - 1, ans + "1");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 3;

        combination(n, "");
    }
}
/// goggle question at home
// pnc binomial theorem and probability